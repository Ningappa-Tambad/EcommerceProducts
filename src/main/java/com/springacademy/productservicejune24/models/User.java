package com.springacademy.productservicejune24.models;

import com.springacademy.productservicejune24.dtos.AddressDto;
import com.springacademy.productservicejune24.dtos.GeoLocationDto;
import com.springacademy.productservicejune24.dtos.UserNameDto;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class User extends BaseModel
{
    private int id;
    private String email;
    private String username;
    private String password;
    private UserNameDto name=new UserNameDto();
    private AddressDto address=new AddressDto();
   // private GeoLocationDto geoLocation=new GeoLocationDto();
    private int phoneNumber;
}
