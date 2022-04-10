package com.example.CRMSystem.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(of = "id")
public class Customer {

    private int id;
    private String name;
    private String mail;

    public Customer(String name, String mail) {
        this.name = name;
        this.mail = mail;
    }


}
