package com.instagramapp.instagram.Repo;

import com.instagramapp.instagram.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IUserRepo extends JpaRepository<User,Long> {

   // User findFirstByUserEmail(String email);
  // User findFirstByUserEmail(String userEmail);

    boolean existsByEmail(String email);

    User findByEmail(String email);
}
