package com.ECommerceAPI_Assignment.ECommerceAPI_Assignment.repositories;

import com.ECommerceAPI_Assignment.ECommerceAPI_Assignment.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}