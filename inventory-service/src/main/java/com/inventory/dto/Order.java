package com.inventory.dto;

import lombok.Data;

@Data
public class Order {

    private String productId;
    private int quantity;
}
