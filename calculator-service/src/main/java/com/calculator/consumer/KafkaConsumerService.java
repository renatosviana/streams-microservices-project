package com.calculator.consumer;

//import com.viana.avro.User;
import org.apache.avro.generic.GenericRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {


//    @KafkaListener(topics = "user-topic", groupId = "my-consumer-group",
//            containerFactory = "kafkaListenerContainerFactory")
//    public void listen(User user, Acknowledgment acknowledgment) {
//        try {
//            System.out.println("Received Avro User: " + user);
//            acknowledgment.acknowledge(); // Manually acknowledge here
//        } catch (Exception e) {
//            // Log error or handle it accordingly
//        }
//    }

    @KafkaListener(topics = "calculation-requests", groupId = "my-consumer-group",
            containerFactory = "kafkaListenerContainerFactory")
    public void listen(GenericRecord record, Acknowledgment acknowledgment) {
        try {
            System.out.println("Received Avro record: " + record);
            acknowledgment.acknowledge(); // Manually acknowledge here
        } catch (Exception e) {
            // Log error or handle it accordingly
            e.printStackTrace();
        }
    }


}


