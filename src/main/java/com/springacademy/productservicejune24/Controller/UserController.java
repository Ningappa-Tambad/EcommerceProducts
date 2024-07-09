package com.springacademy.productservicejune24.Controller;


import com.springacademy.productservicejune24.Services.UserService;
import com.springacademy.productservicejune24.models.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private  UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") long id)
    {
        ResponseEntity<User> responseEntity = null;

        try {
            User user=userService.getSingleUser(id);
            responseEntity=new ResponseEntity<>(user, HttpStatus.OK);

        }
        catch (RuntimeException e)
        {
            e.printStackTrace(System.out);
            responseEntity = new ResponseEntity<>(
                    HttpStatus.NOT_FOUND);
        }

        return responseEntity;
    }

@GetMapping
  public List<User> getAllUsers()
  {
      return userService.getAllUsers();
  }
}
