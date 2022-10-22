package com.kkub.garden.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kkub.garden.domain.User;
import com.kkub.garden.service.UserService;






@RestController
@RequestMapping("/")
public class UserController {

private final UserService userService;


public UserController(UserService userService) {
this.userService = userService;

}
@GetMapping

public String htmll(){
  return "templates";
}


    List<User> getUsers(){
      return userService.getUsers();
      
    }


    
}


    


