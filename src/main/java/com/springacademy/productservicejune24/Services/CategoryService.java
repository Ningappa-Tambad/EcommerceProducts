package com.springacademy.productservicejune24.Services;

import com.springacademy.productservicejune24.models.Category;

import java.util.List;

public interface CategoryService
{
    Category getSingleCategory(long id);

    List<Category> getAllCategories();


}
