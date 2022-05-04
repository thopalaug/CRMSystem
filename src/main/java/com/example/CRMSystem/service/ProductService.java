package com.example.CRMSystem.service;

import com.example.CRMSystem.model.Product;
import com.example.CRMSystem.model.ProductData;

public interface ProductService {

    void addProduct(Product product);
    void deleteProduct(int id);
    Product getProduct(int id);
    void updateProduct(Product product);
    ProductData getData();

}
