package com.example.CRMSystem.service;

import com.example.CRMSystem.model.Order;
import com.example.CRMSystem.model.OrderData;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderData orderData = new OrderData();

    @Override
    public void addOrder(Order order) {
        orderData.addOrder(order);
    }

    @Override
    public void deleteOrder(int id) {

    }

    @Override
    public Order getOrder(int id) {
        return null;
    }

    @Override
    public void updateOrder(Order order) {

    }

    @Override
    public OrderData getData() {
        return orderData;
    }
}
