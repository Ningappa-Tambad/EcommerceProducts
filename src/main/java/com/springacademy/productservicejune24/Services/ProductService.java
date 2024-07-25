package com.springacademy.productservicejune24.Services;

import com.springacademy.productservicejune24.exceptions.ProductNotFoundException;
import com.springacademy.productservicejune24.models.Product;

import java.util.List;

public interface ProductService
{
    Product getSingleProduct(long id) throws ProductNotFoundException;

    List<Product> getAllProducts();

    Product UpdateProduct(Long id,Product product) throws ProductNotFoundException;

    Product ReplaceProduct(Long id,Product product);


    Product addProduct(Product product);

    void deleteProduct(Long id);

    Product UpdateDbProduct(Long id,Product product) throws ProductNotFoundException;

}
