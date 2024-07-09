package com.springacademy.productservicejune24.Controller;

import com.springacademy.productservicejune24.Services.ProductService;
import com.springacademy.productservicejune24.models.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
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
   public ResponseEntity<Product> getProductById(@PathVariable("id") long id) {

        ResponseEntity<Product> responseEntity = null;

        try {

            Product product = productService.getSingleProduct(id);
            responseEntity = new ResponseEntity<>(
                    product,
                    HttpStatus.OK
            );

        }
        catch(RuntimeException e)
        {
            responseEntity = new ResponseEntity<>(
                    HttpStatus.NOT_FOUND);
        }
        return responseEntity;

       //throw new RuntimeException("Something went wrong");
   }

   @GetMapping
   public List<Product> getAllProducts()
   {
    return productService.getAllProducts();
    }

    public void deleteProduct(long productId)
    {

    }

    @PatchMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable("id") Long productId,@RequestBody Product product)
    {

        ResponseEntity<Product> responseEntity = null;
        try {

            responseEntity = new ResponseEntity<>(
                    product,
                    HttpStatus.OK
            );

        }
        catch (RuntimeException e)
        {
            responseEntity = new ResponseEntity<>(
                    HttpStatus.NOT_FOUND);
        }

        return responseEntity;

    }
    @PutMapping("/{id}")
    public Product replaceProduct(@PathVariable("id") Long productId,@RequestBody Product product)
    {
        return null;
    }





}

