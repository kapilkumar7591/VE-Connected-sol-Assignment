package com.ECommerceAPI_Assignment.ECommerceAPI_Assignment.service;

import com.ECommerceAPI_Assignment.ECommerceAPI_Assignment.repositories.ProductRepository;
import com.ECommerceAPI_Assignment.ECommerceAPI_Assignment.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    @Autowired
    public void ProductServiceImpl(ProductRepository theProductDAO) {
        productRepository = theProductDAO;
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(int theProductsId) {
        Optional<Product> results = productRepository.findById(theProductsId);

        Product theProduct = null;
        if(results.isPresent()){
            theProduct = results.get();
        }else{
            throw new RuntimeException("Did not find employee id" + theProductsId);
        }

        return theProduct;
    }


    @Override
    public Product save(Product theProduct) {
        return productRepository.save(theProduct);
    }

    @Transactional
    @Override
    public void deleteById(int theProductsId) {
        productRepository.deleteById(theProductsId);
    }
}