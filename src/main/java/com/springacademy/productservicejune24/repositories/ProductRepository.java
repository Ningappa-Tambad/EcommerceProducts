package com.springacademy.productservicejune24.repositories;

import com.springacademy.productservicejune24.Controller.ProductController;
import com.springacademy.productservicejune24.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long>
{

    //Implement create,update,replace and delete methods


    @Override
    Optional<Product> findById(Long aLong);

    @Override
    List<Product> findAll();

    @Override
    void deleteById(Long aLong);


}
