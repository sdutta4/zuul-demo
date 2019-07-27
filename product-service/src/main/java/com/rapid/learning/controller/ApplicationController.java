package com.rapid.learning.controller;

import com.rapid.learning.model.Product;
import com.rapid.learning.model.ProductCategory;
import com.rapid.learning.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/product-home")
public class ApplicationController {

    @Autowired
    ProductService productService;

    @RequestMapping(value="/products", produces = "application/json")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @RequestMapping(value = "/product/{category}", produces = "application/json")
    public  List<Product> getAllProductsByCategory(@PathVariable("category") String category){
        ProductCategory productCategory = ProductCategory.valueOf(category.toUpperCase());
        return productService.getProductsByCategory(productCategory);
    }
}
