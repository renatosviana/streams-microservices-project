package com;

//import com.fasterxml.jackson.databind.ObjectMapper; // Import Jackson library for JSON parsing

//public class CalculatorApp {
//
//    private static final ObjectMapper mapper = new ObjectMapper();
//
//    public static void main(String[] args) throws Exception {
//        // Example JSON input
//        String jsonInput = "{\"operation\": \"add\", \"number1\": 10, \"number2\": 5}";
//
//        // Parse JSON input
//        CalculationRequest request = mapper.readValue(jsonInput, CalculationRequest.class);
//
//        // Perform the operation
////        double result = performOperation(request);
//
//        // Serialize the operation and result to Avro format for logging
////        serializeToAvro(request, result);
//    }
//
//}
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApp {

    public static void main(String[] args) {
        // Launch the Spring Boot application
        SpringApplication.run(CalculatorApp.class, args);
    }
}
