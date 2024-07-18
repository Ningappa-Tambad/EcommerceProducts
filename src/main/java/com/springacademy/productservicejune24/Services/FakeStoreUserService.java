//package com.springacademy.productservicejune24.Services;
//
//import com.springacademy.productservicejune24.dtos.FakeStoreProductDto;
//import com.springacademy.productservicejune24.dtos.FakeStoreUserDto;
//import com.springacademy.productservicejune24.dtos.UserNameDto;
//import com.springacademy.productservicejune24.models.Product;
//import com.springacademy.productservicejune24.models.User;
//import org.springframework.context.annotation.Primary;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;
//
//import java.util.ArrayList;
//import java.util.List;
//@Service
//public class FakeStoreUserService implements UserService{
//
//
//    private RestTemplate restTemplate;
//
//
//    public FakeStoreUserService(RestTemplate restTemplate) {
//        this.restTemplate = restTemplate;
//    }
//
//
//    @Override
//    public User getSingleUser(long id) {
//
//        //Call fakestore user to fecth user with given id
//
//        FakeStoreUserDto fakeStoreUserDto=restTemplate.getForObject(
//                "https://fakestoreapi.com/users/" + id+ "/", FakeStoreUserDto.class);
//
//
//        //Convert FakeStoreUserDto into User
//
//        return convertFakeStoreUserDtoToUser(fakeStoreUserDto);
//
//
//
//    }
//
//    @Override
//    public List<User> getAllUsers() {
//
//
//        FakeStoreUserDto[] fakeStoreUserDtos= restTemplate.getForObject(
//                "https://fakestoreapi.com/users",
//                FakeStoreUserDto[].class
//        );
//        //COnvert list of fakestoreproductdto into list<product>
//
//        List<User> users = new ArrayList<>();
//
//        for(FakeStoreUserDto fakeStoreUserDto: fakeStoreUserDtos)
//        {
//            users.add(convertFakeStoreUserDtoToUser(fakeStoreUserDto));
//        }
//
//        return users;
//    }
//
//    private User convertFakeStoreUserDtoToUser(FakeStoreUserDto fakeStoreUserDto)
//    {
//        User user = new User();
//
//      user.setId(fakeStoreUserDto.getId());
//      user.setEmail(fakeStoreUserDto.getEmail());
//      user.setUsername(fakeStoreUserDto.getUsername());
//      user.setPassword(fakeStoreUserDto.getPassword());
//      user.getName().setFirstname(fakeStoreUserDto.getName().getFirstname());
//      user.getName().setLastname(fakeStoreUserDto.getName().getLastname());
//      user.getAddress().setCity(fakeStoreUserDto.getAddress().getCity());
//      user.getAddress().setStreet(fakeStoreUserDto.getAddress().getStreet());
//      user.getAddress().setNumber(fakeStoreUserDto.getAddress().getNumber());
//      user.getAddress().setZipcode(fakeStoreUserDto.getAddress().getZipcode());
//
//      user.getAddress().getGeolocation().setLat(fakeStoreUserDto.getAddress().getGeolocation().getLat());
//     // user.getGeoLocation().setLongitude(fakeStoreUserDto.getGeoLocation().getLongitude());
//
//
//
//
//
//
//
//    return user;
//    }
//}
