package com.example.CRMSystem.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductData {

    private int id_value = 1;
    private ArrayList<Product> listOfProducts = new ArrayList<>();

    public ProductData() {
        addProduct(new Product("Milk","1.0% Fat", 30));
        addProduct(new Product("Bread","30.0% Whole Grain", 35));
    }

    public List<Product> getProducts(){
        return Collections.unmodifiableList(listOfProducts);
    }

    public void addProduct(Product product){
        product.setId(id_value);
        listOfProducts.add(product);
        id_value++;
    }
}
