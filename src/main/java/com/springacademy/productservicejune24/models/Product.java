package com.springacademy.productservicejune24.models;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product extends BaseModel {

   private Long id;
    private String title;
    private double price;
    private Category category;


}
