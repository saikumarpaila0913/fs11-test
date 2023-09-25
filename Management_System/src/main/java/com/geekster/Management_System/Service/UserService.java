package com.geekster.Management_System.Service;

import com.geekster.Management_System.Entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {

    private final Map<Long, User> users = new HashMap<>();
    private Long currentUserId = 1L;

    public User addUser(User user) {
        user.setUserId(currentUserId++);
        users.put(user.getUserId(), user);
        return user;
    }

    public User getUser(Long userId) {
        return users.get(userId);
    }

    public List<User> getAllUser() {
        return new ArrayList<>(users.values());
    }

    public User updateUserInfo(Long userId, User updatedUser) {
        if (users.containsKey(userId)) {
            User currentUser = users.get(userId);
            currentUser.setUsername(updatedUser.getUsername());
            currentUser.setDateOfBirth(updatedUser.getDateOfBirth());
            currentUser.setEmail(updatedUser.getEmail());
            currentUser.setPhoneNumber(updatedUser.getPhoneNumber());
            currentUser.setDate(updatedUser.getDate());
            currentUser.setTime(updatedUser.getTime());
            return currentUser;
        }
        return null; // User not found
    }

    public void deleteUser(Long userId) {
        users.remove(userId);
    }
}
