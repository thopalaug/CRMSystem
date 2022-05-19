package com.example.CRMSystem.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(of = "id")
public class Order {

    private int id;
    private String orderDetails;
    private int totalCost;
    private ProductData productData;

    public Order() {
    }

    public Order(String orderDetails, int totalCost) {
        this.orderDetails = orderDetails;
        this.totalCost = totalCost;
    }
}
