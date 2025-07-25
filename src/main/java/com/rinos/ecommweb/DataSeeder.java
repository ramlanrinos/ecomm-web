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
                            4.5, "Electronics", "TechTrend", 100, 250, Arrays.asList("https://picsum.photos/id/1/200/300", "https://picsum.photos/id/2/200/300")),
                    new Product("Bluetooth Headphones", 79.99, "Noise-cancelling over-ear headphones",
                            4.7, "Electronics", "SoundWave", 50, 180, Arrays.asList("https://picsum.photos/id/3/200/300", "https://picsum.photos/id/4/200/300")),
                    new Product("Running Shoes", 59.99, "Lightweight running shoes with cushioning",
                            4.3, "Sports", "FitGear", 75, 120, Arrays.asList("https://picsum.photos/id/5/200/300", "https://picsum.photos/id/6/200/300")),
                    new Product("Coffee Maker", 49.99, "12-cup programmable coffee maker",
                            4.2, "Home Appliances", "KitchenPro", 30, 90, Arrays.asList("https://picsum.photos/id/7/200/300", "https://picsum.photos/id/8/200/300")),
                    new Product("Backpack", 39.99, "Water-resistant backpack with laptop compartment",
                            4.6, "Accessories", "TravelEasy", 60, 200, Arrays.asList("https://picsum.photos/id/9/200/300", "https://picsum.photos/id/10/200/300")),
                    new Product("Smartphone Case", 19.99, "Shockproof case for iPhone 14",
                            4.4, "Electronics", "PhoneGuard", 150, 300, Arrays.asList("https://picsum.photos/id/11/200/300", "https://picsum.photos/id/12/200/300")),
                    new Product("Yoga Mat", 24.99, "Non-slip yoga mat with carrying strap",
                            4.8, "Sports", "FitGear", 80, 160, Arrays.asList("https://picsum.photos/id/13/200/300", "https://picsum.photos/id/14/200/300")),
                    new Product("LED Desk Lamp", 34.99, "Adjustable LED lamp with USB port",
                            4.5, "Home Decor", "BrightLite", 45, 110, Arrays.asList("https://picsum.photos/id/15/200/300", "https://picsum.photos/id/16/200/300")),
                    new Product("Wireless Charger", 29.99, "Fast-charging wireless pad for smartphones",
                            4.3, "Electronics", "TechTrend", 90, 140, Arrays.asList("https://picsum.photos/id/17/200/300", "https://picsum.photos/id/18/200/300")),
                    new Product("Stainless Steel Water Bottle", 22.99, "Insulated 32oz water bottle",
                            4.7, "Accessories", "EcoTrend", 70, 180, Arrays.asList("https://picsum.photos/id/19/200/300", "https://picsum.photos/id/20/200/300"))
            );

            productRepository.saveAll(products);
            System.out.println("All products have been saved");
        }
    }
}
