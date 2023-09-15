package org.example; // Ensure that the package declaration is correct

import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;

@Service
public class UserService {
    private final Map<Long, User> userMap = new HashMap<>();
    private Long currentUserId = 1L;

    public User addUser(User user) {
        user.setUserId(currentUserId++);
        userMap.put(user.getUserId(), user);
        return user;
    }

    public User getUser(Long userId) {
        return userMap.get(userId);
    }

    public Collection<User> getAllUsers() {
        return userMap.values();
    }

    public User updateUserInfo(Long userId, User updatedUser) {
        if (userMap.containsKey(userId)) {
            updatedUser.setUserId(userId);
            userMap.put(userId, updatedUser);
            return updatedUser;
        }
        return null; // User not found
    }

    public void deleteUser(Long userId) {
        userMap.remove(userId);
    }
}
