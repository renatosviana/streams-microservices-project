package com.inventory.service;

import com.inventory.model.Inventory;
import com.inventory.dto.Order;
import com.inventory.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    @Transactional
    @KafkaListener(topics = "order-topic", groupId = "inventory-group")
    public void listen(Order order) {
        Inventory inventory = inventoryRepository.findByProductId(order.getProductId());
        if (inventory != null && inventory.getQuantity() >= order.getQuantity()) {
            inventory.setQuantity(inventory.getQuantity() - order.getQuantity());
            inventoryRepository.save(inventory);
        } else {
            // Handle insufficient inventory
            System.out.println("Insufficient inventory for product ID: " + order.getProductId());
        }
    }
}
