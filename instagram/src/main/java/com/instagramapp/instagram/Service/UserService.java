package com.instagramapp.instagram.Service;

import com.instagramapp.instagram.Model.AuthenticationToken;
import com.instagramapp.instagram.Model.User;
import com.instagramapp.instagram.Repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;

@Service
public class UserService {
    @Autowired
    IUserRepo iUserRepo;
        public String signUp(User user) {
            // Check if the email is already registered
            if (iUserRepo.existsByEmail(user.getEmail())) {
                return "Email already exists";

            }


            iUserRepo.save(user);
            return "signedUP";
        }

        public String signIn(User user) {
            // Find the user by email
            User existingUser = iUserRepo.findByEmail(user.getEmail());

            if (existingUser == null) {
                return "User not found";
            }

                AuthenticationToken token = new AuthenticationToken(existingUser);
                return token.getToken();

        }

        public User updateUser(Long userId, User user) {
            User existingUser = iUserRepo.findById(userId)
                    .orElseThrow(() -> new IllegalArgumentException("User not found"));

            // Update user details (you may want to add more validation and logic here)
            existingUser.setFirstName(user.getFirstName());
            existingUser.setLastName(user.getLastName());
            existingUser.setAge(user.getAge());
            existingUser.setPhoneNumber(user.getPhoneNumber());
            existingUser.setPassword(user.getPassword());

            return iUserRepo.save(existingUser);
        }

    }
