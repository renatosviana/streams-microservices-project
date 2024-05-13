package com.service;

import com.producer.KafkaProducerService;
import com.viana.avro.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private KafkaProducerService kafkaProducerService;

    public void createUserAndSend(String name, String email) {
        User newUser = new User(1, name, email);
        kafkaProducerService.sendUser("user-topic", newUser);
    }
}

