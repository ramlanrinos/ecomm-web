package com.rinos.ecommweb.controllers;

import com.rinos.ecommweb.models.Product;
import com.rinos.ecommweb.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
public class TestController {

    @Autowired
    private ProductService productService;

    @GetMapping("/test")
    public String test() {
        return "Hello, testing";
    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
}
