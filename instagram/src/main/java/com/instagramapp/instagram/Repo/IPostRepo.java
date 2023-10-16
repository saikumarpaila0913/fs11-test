package com.instagramapp.instagram.Repo;

import com.instagramapp.instagram.Model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPostRepo extends JpaRepository<Post,Long> {
}
