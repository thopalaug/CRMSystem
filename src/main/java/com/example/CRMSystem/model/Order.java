package com.example.CRMSystem.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(of = "id")
public class Order {

    private int id;
    private String orderDetails;
    private ProductData productData;

    public Order() {
    }

}
