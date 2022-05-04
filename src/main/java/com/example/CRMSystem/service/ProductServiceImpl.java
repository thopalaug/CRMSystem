package com.example.CRMSystem.service;

import com.example.CRMSystem.model.Product;
import com.example.CRMSystem.model.ProductData;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductData productData = new ProductData();

    @Override
    public void addProduct(Product product) {
        productData.addProduct(product);
    }

    @Override
    public void deleteProduct(int id) {

    }

    @Override
    public Product getProduct(int id) {
        return null;
    }

    @Override
    public void updateProduct(Product product) {

    }

    @Override
    public ProductData getData() {
        return productData;
    }
}
