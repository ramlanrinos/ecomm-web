package com.rinos.ecommweb;

import com.rinos.ecommweb.models.Product;
import com.rinos.ecommweb.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DataSeeder implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;

    public void run(String[] args) throws Exception {
        if (productRepository.count() == 0) {
            List<Product> products = Arrays.asList(
                    new Product("Wireless Mouse", 29.99, "Ergonomic wireless mouse with adjustable DPI",
                            4.5, "Electronics", "TechTrend", 100, 250),
                    new Product("Bluetooth Headphones", 79.99, "Noise-cancelling over-ear headphones",
                            4.7, "Electronics", "SoundWave", 50, 180),
                    new Product("Running Shoes", 59.99, "Lightweight running shoes with cushioning",
                            4.3, "Sports", "FitGear", 75, 120),
                    new Product("Coffee Maker", 49.99, "12-cup programmable coffee maker",
                            4.2, "Home Appliances", "KitchenPro", 30, 90),
                    new Product("Backpack", 39.99, "Water-resistant backpack with laptop compartment",
                            4.6, "Accessories", "TravelEasy", 60, 200),
                    new Product("Smartphone Case", 19.99, "Shockproof case for iPhone 14",
                            4.4, "Electronics", "PhoneGuard", 150, 300),
                    new Product("Yoga Mat", 24.99, "Non-slip yoga mat with carrying strap",
                            4.8, "Sports", "FitGear", 80, 160),
                    new Product("LED Desk Lamp", 34.99, "Adjustable LED lamp with USB port",
                            4.5, "Home Decor", "BrightLite", 45, 110),
                    new Product("Wireless Charger", 29.99, "Fast-charging wireless pad for smartphones",
                            4.3, "Electronics", "TechTrend", 90, 140),
                    new Product("Stainless Steel Water Bottle", 22.99, "Insulated 32oz water bottle",
                            4.7, "Accessories", "EcoTrend", 70, 180)
            );

            productRepository.saveAll(products);
            System.out.println("All products have been saved");
        }
    }
}
