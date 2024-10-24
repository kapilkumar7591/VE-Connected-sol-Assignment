package com.ECommerceAPI_Assignment.ECommerceAPI_Assignment.service;

import com.ECommerceAPI_Assignment.ECommerceAPI_Assignment.repositories.OrderRepository;
import com.ECommerceAPI_Assignment.ECommerceAPI_Assignment.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

    private OrderRepository orderRepository;

    @Autowired
    public OrderServiceImpl(OrderRepository theOrderDAO) {
        orderRepository = theOrderDAO;
    }

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public Order findById(int theOrdersId) {
        Optional<Order> result = orderRepository.findById(theOrdersId);

        Order theOrder = null;
        if(result.isPresent()){
            theOrder = result.get();
        }else{
            throw new RuntimeException("Did not find employee id" + theOrdersId);
        }

        return theOrder;
    }

    @Override
    public Order save(Order theOrder) {
        return orderRepository.save(theOrder);
    }

    @Transactional
    @Override
    public void deleteById(int theOrdersId) {
        orderRepository.deleteById(theOrdersId);
    }
}