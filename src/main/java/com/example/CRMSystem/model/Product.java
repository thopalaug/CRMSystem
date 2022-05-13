package com.example.CRMSystem.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(of = "id")
public class Product {

    private int id;
    private String name;
    private String productDetails;
    private int price;

    public Product() {
    }

    public Product(String name, String productDetails, int price) {
        this.name = name;
        this.productDetails = productDetails;
        this.price = price;
    }
}
