package com.rapid.learning.service;

import com.rapid.learning.model.Product;
import com.rapid.learning.model.ProductCategory;
import com.rapid.learning.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class ProductService {

    @Autowired
    ProductRepository productRepository;


    public List<Product> getAllProducts(){
        return productRepository.getAllProducts();
    }

    public List<Product> getProductsByCategory(ProductCategory category){
        return productRepository.getProductsByCategory(category);
    }
}
