package com.service;

import com.CalculationRequest;
import org.apache.avro.Schema;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericRecord;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Service
public class CalculatorService {

    private final KafkaTemplate<String, GenericRecord> kafkaTemplate;
    private final Schema schema;

    public CalculatorService(KafkaTemplate<String, GenericRecord> kafkaTemplate, @Value("classpath:avro/avro.avsc") Resource schemaResource) throws IOException {
        this.kafkaTemplate = kafkaTemplate;
        this.schema = new Schema.Parser().parse(new String(Files.readAllBytes(Paths.get(schemaResource.getURI()))));
    }


    public double performOperation(CalculationRequest request) {
        return switch (request.getOperation()) {
            case "add" -> request.getNumber1() + request.getNumber2();
            case "subtract" -> request.getNumber1() - request.getNumber2();
            case "multiply" -> request.getNumber1() * request.getNumber2();
            case "divide" -> request.getNumber1() / request.getNumber2();
            default -> throw new IllegalArgumentException("Unknown operation: " + request.getOperation());
        };
    }

    public void serializeToAvro(CalculationRequest request, double result) {
        GenericRecord record = new GenericData.Record(schema);
        record.put("operation", request.getOperation());
        record.put("number1", request.getNumber1());
        record.put("number2", request.getNumber2());
        record.put("result", result);

        kafkaTemplate.send("calculation-requests", record);
    }

}
