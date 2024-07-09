package com.springacademy.productservicejune24.Services;

import com.springacademy.productservicejune24.models.Product;

import java.util.List;

public interface ProductService
{
    Product getSingleProduct(long id);

    List<Product> getAllProducts();

    Product UpdateProduct(Long id,Product product);

    Product ReplaceProduct(Long id,Product product);
}
