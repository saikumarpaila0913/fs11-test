package com.instagramapp.instagram.Controller;

import com.instagramapp.instagram.Model.Post;
import com.instagramapp.instagram.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@RestController

public class PostController {
    //save post
    // getpost

    @Autowired
    private PostService postService;

    @PostMapping("/newpost")
    public String savePost(@RequestBody Post post) {
       // Post savedPost = postService.addPost(post);
        return postService.addPost(post);
    }

    @GetMapping("/{postId}")
    public Optional<Post> getPost(@PathVariable Long postId) {
         postService.getPost(postId);
        return  postService.getPost(postId);
    }
    
    
    
    
    


}
