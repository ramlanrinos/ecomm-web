package com.rinos.ecommweb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "Hello, testing";
    }

    @GetMapping("/products")
    public List<Map<String, Object>> getAllProducts() {
        return Arrays.asList(
                Map.of("name", "product1", "price", 234),
                Map.of("name", "product1", "price", 123)
        );
    }
}
