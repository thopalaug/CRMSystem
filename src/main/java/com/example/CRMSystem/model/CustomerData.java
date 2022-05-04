package com.example.CRMSystem.model;

import lombok.NonNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class CustomerData {

    private int id_value = 1;
    private final ArrayList<Customer> listOfCustomers = new ArrayList<>();

    public CustomerData() {
        addCustomer(new Customer("Ola Nordmann", "ola@gmail.com"));
        addCustomer(new Customer("Kari Nordmann", "kari_n@gmail.com"));
        addCustomer(new Customer("Benny Jonhson", "b_j@outlook.com"));
        addCustomer(new Customer("Hans Hansen", "hans.hansen@live.com"));
    }

    public void addCustomer(@NonNull Customer customer){
        customer.setId(id_value);
        listOfCustomers.add(customer);
        id_value++;
    }

    public Customer getCustomer(int customer_id){
        for (Customer customer: listOfCustomers
        ) { if(customer.getId() == customer_id)
            return customer;
        }
        return null;
    }

    public List<Customer> getCustomers(){
        return Collections.unmodifiableList(listOfCustomers);
    }

    public void removeCustomer(int id){
        ListIterator<Customer> customerListIterator = listOfCustomers.listIterator();

        while(customerListIterator.hasNext()){
            Customer customer = customerListIterator.next();

            if(customer.getId() == id){
                customerListIterator.remove();
                break;
            }
        }
    }

    // Feil ligger i denne metoden
    public void updateCustomer(@NonNull Customer customerToUpdate){

        ListIterator<Customer> customerListIterator = listOfCustomers.listIterator();

        while(customerListIterator.hasNext()){
            Customer customer = customerListIterator.next();
            System.out.println(customerToUpdate.toString());
            if(customer.equals(customerToUpdate)){
                customerListIterator.set(customerToUpdate);

                break;
            }
        }

    }


}
