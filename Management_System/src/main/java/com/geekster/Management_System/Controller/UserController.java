package com.geekster.Management_System.Controller;

import com.geekster.Management_System.Entity.User;
import com.geekster.Management_System.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/api/users")
@Validated
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public User addUser(@Valid @RequestBody User user) {
        return userService.addUser(user);
    }

    @GetMapping("/getUser/{userId}")
    public User getUser(@PathVariable Long userId) {
        return userService.getUser(userId);
    }

    @GetMapping("/getAllUser")
    public List<User> getAllUser() {
        return userService.getAllUser();
    }

    @PutMapping("/updateUserInfo/{userId}")
    public User updateUserInfo(@PathVariable Long userId, @Valid @RequestBody User updatedUser) {
        return userService.updateUserInfo(userId, updatedUser);
    }

    @DeleteMapping("/deleteUser/{userId}")
    public String deleteUser(@PathVariable Long userId) {
        userService.deleteUser(userId);
        return "User with ID " + userId + " deleted successfully.";
    }
}
