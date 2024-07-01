package com.springacademy.productservicejune24.Controller;

import com.springacademy.productservicejune24.Services.ProductService;
import com.springacademy.productservicejune24.models.Product;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/products")
public class ProductController
{

    private ProductService productService;

    public ProductController(ProductService productService)
    {
        this.productService = productService;
    }

    //http::localhost:8080/products/10
    @GetMapping("/{id}")
   public Product getProductById(@PathVariable("id") long id)
   {
       return productService.getSingleProduct(id);
   }

   @GetMapping
   public List<Product> getAllProducts()
   {
    return productService.getAllProducts();
    }





}

