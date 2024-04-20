package api.consumer;

import com.viana.avro.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "userTopic", groupId = "my-consumer-group")
    public void listen(User user) {
        System.out.println("Received Avro User: " + user);
    }
}


