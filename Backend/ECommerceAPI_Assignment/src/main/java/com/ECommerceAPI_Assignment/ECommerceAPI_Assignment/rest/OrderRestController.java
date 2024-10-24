package com.ECommerceAPI_Assignment.ECommerceAPI_Assignment.rest;


import com.ECommerceAPI_Assignment.ECommerceAPI_Assignment.entity.Order;
import com.ECommerceAPI_Assignment.ECommerceAPI_Assignment.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class OrderRestController {

    private OrderService orderService;

    @Autowired
    public OrderRestController(OrderService theOrderService) {
        orderService = theOrderService;
    }

    // expose "/orders" and return a list of employees
    @GetMapping("/orders")
    public List<Order> findAll() {
        return orderService.findAll();
    }

    // add mapping for GET /employees/{employeeId}

    @GetMapping("/orders/{orderId}")
    public Order getOrder(@PathVariable int orderId) {

        Order theOrder = orderService.findById(orderId);

        if (theOrder == null) {
            throw new RuntimeException("Employee id not found - " + orderId);
        }

        return theOrder;
    }

    // add mapping for POST /employees - add new employee

    @PostMapping("/orders")
    public Order addOrder(@RequestBody Order theOrder) {

        // also just in case they pass an id in JSON ... set id to 0
        // this is to force a save of new item ... instead of update

        theOrder.setId(0);

        Order dbOrder = orderService.save(theOrder);

        return dbOrder;
    }

    // add mapping for PUT /employees - update existing employee

    @PutMapping("/orders")
    public Order updateOrder(@RequestBody Order theOrder) {

        Order dbOrder = orderService.save(theOrder);

        return dbOrder;
    }

    // add mapping for DELETE /employees/{employeeId} - delete employee

    @DeleteMapping("/orders/{orderId}")
    public String deleteOrder(@PathVariable int orderId) {

        Order tempOrder = orderService.findById(orderId);

        // throw exception if null

        if (tempOrder == null) {
            throw new RuntimeException("Employee id not found - " + orderId);
        }

        orderService.deleteById(orderId);

        return "Deleted employee id - " + orderId;
    }

}