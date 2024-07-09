package com.springacademy.productservicejune24.dtos;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreUserDto {

    private int id;
    private String email;
    private String username;
    private String password;
    private UserNameDto name;
    private AddressDto address;

    private int phoneNumber;


}
