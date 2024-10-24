package com.ECommerceAPI_Assignment.ECommerceAPI_Assignment.service;

import com.ECommerceAPI_Assignment.ECommerceAPI_Assignment.entity.Order;

import java.util.List;

public interface OrderService {

    List<Order> findAll();

    Order findById(int theOrderId);

    Order save(Order theOrder);

    void deleteById(int theOrdersId);

}