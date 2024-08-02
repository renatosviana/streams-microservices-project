package com.calculator.controller;

import com.calculator.dto.UserRequest;
import com.calculator.producer.KafkaProducerService;
//import com.viana.avro.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/com")
public class UserController {

    @Autowired
    private KafkaProducerService kafkaProducerService;

    @PostMapping("/users")
    public ResponseEntity<String> createUser(@RequestBody UserRequest userRequest) {
//        User newUser = new User(1, userRequest.getName(), userRequest.getEmail());
//        kafkaProducerService.sendUser("user-topic", newUser);
        return new ResponseEntity<>("User created and sent!", HttpStatus.CREATED);
    }

}
