package com.springacademy.productservicejune24.dtos;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressDto
{
    private String city;
    private String street;
    private String number;
    private String zipcode;
    private GeoLocationDto geolocation=new GeoLocationDto();

}
