package com.kkub.garden.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.kkub.garden.domain.User;

@Service
public class UserService {

    public  List<User> getUsers() {
       return Arrays.asList(
             new User("Stefan", null),
             new User("Andrzej", null),
             new User("Tomek",null)
        );
   
}

  

    
}
