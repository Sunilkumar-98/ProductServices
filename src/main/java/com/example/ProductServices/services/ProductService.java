package com.example.ProductServices.services;

import com.example.ProductServices.exceptions.ProductNotFoundException;
import com.example.ProductServices.models.Product;

public interface ProductService {

    public Product getProductById(long id) throws ProductNotFoundException;
}
