package com.nie.user_val.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.nie.user_val.services.UserService;
import com.nie.user_val.models.User;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class UserController {
    
    @Autowired
    UserService service;

    @GetMapping("/users")    
    public List<User> getAllUser(){
        return service.getAllUsers();
    } 

    @PostMapping("/users")
    public User addUser(@RequestBody User user){
        return service.addUser(user);
    }
    
}
