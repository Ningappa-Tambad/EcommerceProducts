package com.springacademy.productservicejune24.Services;

import com.springacademy.productservicejune24.exceptions.ProductNotFoundException;
import com.springacademy.productservicejune24.models.Category;
import com.springacademy.productservicejune24.models.Product;
import com.springacademy.productservicejune24.repositories.CategoryRepository;
import com.springacademy.productservicejune24.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;
import java.util.Optional;


@Service("selfProductService")
public class SelfProductService implements ProductService{

   private ProductRepository productRepository;
   private CategoryRepository categoryRepository;


   public SelfProductService(ProductRepository productRepository,
                             CategoryRepository categoryRepository)
   {
       this.productRepository = productRepository;
       this.categoryRepository = categoryRepository;
   }
    @Override
    public Product getSingleProduct(long id) throws ProductNotFoundException {

        //Make a call to DB and fetch a product with given id


        Optional<Product> productOptional = productRepository.findById(id);

        if(productOptional.isEmpty())
        {
            throw new ProductNotFoundException("Product with id" + id + "Does not exist");
        }

        return productOptional.get();


    }

    @Override
    public List<Product> getAllProducts() {

       return productRepository.findAll();
    }

    @Override
    public Product UpdateProduct(Long id, Product product) {
        return null;
    }

    @Override
    public Product ReplaceProduct(Long id, Product product) {
        return null;
    }



    //Implement product API's using DB

    @Override
    public Product addProduct(Product product) {


       Category category = product.getCategory();

       if(category.getId()==null)
       {
           // We need to create a new Category object in the DB first.
           category = categoryRepository.save(category);
           product.setCategory(category);
       }

        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Long id) {


      productRepository.deleteById(id);
    }


}
