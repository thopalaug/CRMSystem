package com.example.CRMSystem.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(of = "id")
public class Order {

    private int id;
    private String orderDetails;
    private List<Product> productList = new ArrayList<>();

    public Order() {
    }
}
