package com.example.CRMSystem.model;

import java.util.ArrayList;

public class OrderData {

    private int id_value = 1;
    private ArrayList<Order> listOfOrders = new ArrayList<>();

    public OrderData() {
    }

    public void addOrder(Order order){
        order.setId(id_value);
        listOfOrders.add(order);
        id_value++;
    }


}
