package com.rapid.learning.model;

public class Product {

    private String productName;
    private String productDescription;
    private ProductCategory productCategory;
    private long price;

    public String getProductName() {
        return productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public long getPrice() {
        return price;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
