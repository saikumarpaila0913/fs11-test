package com.instagramapp.instagram.Repo;

import com.instagramapp.instagram.Model.AuthenticationToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAuthenticationRepo extends JpaRepository<AuthenticationToken,Long> {
    AuthenticationToken findByToken(String token);
}