package com.alem.vision2020.services;

import com.alem.vision2020.entity.Orders;
import com.alem.vision2020.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Orders> getOrders() {
        List<Orders> orders = orderRepository.findAll();
        for (Orders order : orders) {
            System.out.println("Order Id: " + order.getOrderId());
        }
        return orderRepository.findAll();
    }
}

