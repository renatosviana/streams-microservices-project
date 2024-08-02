package com.order.service;

import com.order.dto.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final KafkaTemplate<String, Order> kafkaTemplate;

    @Autowired
    public OrderService(KafkaTemplate<String, Order> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void processOrder(Order order) {
        kafkaTemplate.send("order-topic", order);
    }
}
