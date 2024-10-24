package com.ECommerceAPI_Assignment.ECommerceAPI_Assignment.rest;

import com.ECommerceAPI_Assignment.ECommerceAPI_Assignment.entity.Product;
import com.ECommerceAPI_Assignment.ECommerceAPI_Assignment.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductRestController {

    private ProductService productService;

    @Autowired
    public ProductRestController(ProductService theProductService) {
        productService = theProductService;
    }

    // expose "/employees" and return a list of employees
    @GetMapping("/product")
    public List<Product> findAll() {
        return productService.findAll();
    }

    // add mapping for GET /employees/{employeeId}

    @GetMapping("/product/{productId}")
    public Product getProduct(@PathVariable int productId) {

        Product theProduct = productService.findById(productId);

        if (theProduct == null) {
            throw new RuntimeException("Employee id not found - " + productId);
        }

        return theProduct;
    }

    // add mapping for POST /employees - add new employee

    @PostMapping("/product")
    public Product addProduct(@RequestBody Product theProduct) {

        // also just in case they pass an id in JSON ... set id to 0
        // this is to force a save of new item ... instead of update

        theProduct.setProductid(0);

        Product dbProduct = productService.save(theProduct);

        return dbProduct;
    }

    // add mapping for PUT /employees - update existing employee

    @PutMapping("/product")
    public Product updateProduct(@RequestBody Product theProduct) {

        Product dbProduct = productService.save(theProduct);

        return dbProduct;
    }

    // add mapping for DELETE /employees/{employeeId} - delete employee

    @DeleteMapping("/product/{productId}")
    public String deleteProduct(@PathVariable int productId) {

        Product tempProduct = productService.findById(productId);

        // throw exception if null

        if (tempProduct == null) {
            throw new RuntimeException("Employee id not found - " + productId);
        }

        productService.deleteById(productId);

        return "Deleted employee id - " + productId;
    }

}