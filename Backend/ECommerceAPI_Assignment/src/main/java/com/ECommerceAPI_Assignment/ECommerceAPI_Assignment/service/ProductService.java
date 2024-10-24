package com.ECommerceAPI_Assignment.ECommerceAPI_Assignment.service;

import com.ECommerceAPI_Assignment.ECommerceAPI_Assignment.entity.Order;
import com.ECommerceAPI_Assignment.ECommerceAPI_Assignment.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAll();

    Product findById(int theProductsId);

    Product save(Product theProduct);

    void deleteById(int theProductsId);

}