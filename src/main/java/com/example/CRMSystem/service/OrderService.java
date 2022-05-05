package com.example.CRMSystem.service;

import com.example.CRMSystem.model.Order;
import com.example.CRMSystem.model.OrderData;

public interface OrderService {

    void addOrder(Order order);
    void deleteOrder(int id);
    Order getOrder(int id);
    void updateOrder(Order order);
    OrderData getData();

}
