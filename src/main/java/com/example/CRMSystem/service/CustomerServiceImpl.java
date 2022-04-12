package com.example.CRMSystem.service;

import com.example.CRMSystem.model.Customer;
import com.example.CRMSystem.model.CustomerData;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerData customerData = new CustomerData();

    @Override
    public void addCustomer(Customer customer) {
        customerData.addCustomer(customer);
    }

    @Override
    public void deleteCustomer(int id) {
        customerData.removeCustomer(id);
    }

    @Override
    public Customer getCustomer(int id) {
        return customerData.getCustomer(id);
    }

    @Override
    public void updateCustomer(Customer customer) {
        customerData.updateCustomer(customer);
    }

    @Override
    public CustomerData getData() {
        return customerData;
    }
}
