package com.example.CRMSystem.service;

import com.example.CRMSystem.model.Customer;
import com.example.CRMSystem.model.CustomerData;

public interface CustomerService {

    void addCustomer(Customer customer);
    void deleteCustomer(int id);
    Customer getCustomer(int it);
    void updateCustomer(Customer customer);
    CustomerData getData();
}
