package com.instagramapp.instagram.Controller;

import com.instagramapp.instagram.Model.AuthenticationToken;
import com.instagramapp.instagram.Model.User;
import com.instagramapp.instagram.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
public class UserController {
    @Autowired
    UserService Userservice;

    @PostMapping("/signup")
    public String signUp(@RequestBody User user) {

        return Userservice.signUp(user);
    }

    @PostMapping("/signin")
    public String signIn(@RequestBody User user) {
       // AuthenticationToken token = Userservice.signIn(user);
        return Userservice.signIn(user);
    }

    @PutMapping("/{userId}")
    public User updateUser(@PathVariable Long userId, @RequestBody User user) {
       // User updatedUser = Userservice.updateUser(userId, user);
        return  Userservice.updateUser(userId, user);
    }

//update details
}
