package com.example.CRMSystem.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(of = "id")
public class Product {

    private int id;
    private int price;
    private String productDetails;

    public Product() {
    }
}
