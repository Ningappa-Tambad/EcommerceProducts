package com.springacademy.productservicejune24.dtos;


import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
public class FakeStoreProductDto
{
    private Long id;
    private String title;
    private double price;
    private String category;
    private String description;
    private String image;


}
