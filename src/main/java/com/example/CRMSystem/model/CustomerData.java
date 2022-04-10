package com.example.CRMSystem.model;

import lombok.NonNull;

import java.util.ArrayList;

public class CustomerData {

    private int id_value = 1;

    ArrayList<Customer> listOfCustomers = new ArrayList<>();

    public CustomerData() {
        addCustomer(new Customer("Ola Nordmann", "ola@gmail.com"));
    }

    public void addCustomer(@NonNull Customer customer){
        customer.setId(id_value);
        listOfCustomers.add(customer);
        id_value++;
    }

    public void removeCustomer(int id){
        listOfCustomers.remove(id);
    }


}
