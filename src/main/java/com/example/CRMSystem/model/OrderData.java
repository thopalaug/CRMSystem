package com.example.CRMSystem.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderData {

    private int id_value = 1;
    private ArrayList<Order> listOfOrders = new ArrayList<>();

    public OrderData() {
        addOrder(new Order("This is an order", 15));
        addOrder(new Order("Something cheap", 15));
        addOrder(new Order("A very expensive crate", 15));
    }

    public List<Order> getOrders(){
        return Collections.unmodifiableList(listOfOrders);
    }

    public void addOrder(Order order){
        order.setId(id_value);
        listOfOrders.add(order);
        id_value++;
    }


}
