package com.instagramapp.instagram.Service;

import com.instagramapp.instagram.Model.Post;
import com.instagramapp.instagram.Repo.IPostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private IPostRepo postRepository;

    public String addPost(Post post){
         postRepository.save(post);
         return "Posted";
    }

    public Optional<Post> getPost(Long Id){
        Optional<Post> Existing = postRepository.findById(Id);
        return Existing;
    }


}
