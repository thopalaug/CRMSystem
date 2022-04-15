package com.example.CRMSystem.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(of = "id")
public class Customer {

    // -- Fields --
    private int id;
    private String name;
    private String mail;
    private List<Order> orderList = new ArrayList<>();

    // -- Constructors
    public Customer() {
    }

    public Customer(String name, String mail) {
        this.name = name;
        this.mail = mail;
    }


}
