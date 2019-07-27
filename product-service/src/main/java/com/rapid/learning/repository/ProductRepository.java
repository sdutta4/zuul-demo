package com.rapid.learning.repository;

import com.rapid.learning.model.Product;
import com.rapid.learning.model.ProductCategory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductRepository {

    static List<Product> allProducts = new ArrayList<Product>();

    static {
        Product product = new Product();
        product.setPrice(100l);
        product.setProductName("High On mountain");
        product.setProductCategory(ProductCategory.BOOK);
        product.setProductDescription("A fiction about love and hate");

        Product product1 = new Product();
        product1.setPrice(2000l);
        product1.setProductName("BedSheet");
        product1.setProductCategory(ProductCategory.HOUSEHOLD);
        product1.setProductDescription("A cotton bedsheet");

        Product product2 = new Product();
        product2.setPrice(1000l);
        product2.setProductName("Pendrive");
        product2.setProductCategory(ProductCategory.ELECTRONICS);
        product2.setProductDescription("XYZ pendrive");

        Product product3 = new Product();
        product3.setPrice(850l);
        product3.setProductName("Formal shoe");
        product3.setProductCategory(ProductCategory.APPERALLEL);
        product3.setProductDescription("A nice formal shoe");

        Product product4 = new Product();
        product4.setPrice(2500l);
        product4.setProductName("Black shirt");
        product4.setProductCategory(ProductCategory.APPERALLEL);
        product4.setProductDescription("A party shirt");

        Product product5 = new Product();
        product5.setPrice(45000l);
        product5.setProductName("Laptop");
        product5.setProductCategory(ProductCategory.ELECTRONICS);
        product5.setProductDescription("A hig config laptop");

        Product product6 = new Product();
        product6.setPrice(50l);
        product6.setProductName("Pen");
        product6.setProductCategory(ProductCategory.STATIONARY);
        product6.setProductDescription("A nice pen");

        Product product7 = new Product();
        product7.setPrice(150l);
        product7.setProductName("Workbook");
        product7.setProductCategory(ProductCategory.STATIONARY);
        product7.setProductDescription("A school workbook");

        Product product8 = new Product();
        product8.setPrice(10000l);
        product8.setProductName("CellPhone");
        product8.setProductCategory(ProductCategory.ELECTRONICS);
        product8.setProductDescription("A smart phone");

        Product product9 = new Product();
        product9.setPrice(150l);
        product9.setProductName("Life of pi");
        product9.setProductCategory(ProductCategory.BOOK);
        product9.setProductDescription("A life of pie book");

        allProducts.add(product);
        allProducts.add(product1);
        allProducts.add(product2);
        allProducts.add(product3);
        allProducts.add(product4);
        allProducts.add(product5);
        allProducts.add(product6);
        allProducts.add(product7);
        allProducts.add(product8);
        allProducts.add(product9);
    }

    public List<Product> getAllProducts(){
        return allProducts;
    }


    public List<Product> getProductsByCategory(final ProductCategory category){
        return allProducts.stream()
                .filter(pro -> pro.getProductCategory()==category)
                .collect(Collectors.toList());
    }
}
