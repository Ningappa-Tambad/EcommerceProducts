package com.springacademy.productservicejune24.Services;

import com.springacademy.productservicejune24.models.Category;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class FakeStoreCategoryService implements CategoryService {

    private RestTemplate restTemplate;


    public FakeStoreCategoryService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    @Override
    public Category getSingleCategory(long id) {
        restTemplate.getForObject("https://fakestoreapi.com/products/category/" + id, Category.class
        );

        return null;
    }

    @Override
    public List<Category> getAllCategories()
    {
        return List.of();
    }
}
