package com.rapid.learning.controller;

import com.rapid.learning.repository.ProductRepository;
import com.rapid.learning.service.ProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public ProductService getProductService(){
        return new ProductService();
    }

    @Bean
    public ProductRepository getProductRepository(){
        return new ProductRepository();
    }
}
