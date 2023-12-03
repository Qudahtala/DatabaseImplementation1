package com.example.PostingWebsite.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/posts")
public class postController {

    @Autowired
    private postService PostService;

    @PostMapping
    public ResponseEntity<String> createPost(@RequestBody PostDTO postDTO) {
        postService.createPost(postDTO);
        return ResponseEntity.ok("Post created successfully");
    }

    @GetMapping("/{postId}")
    public ResponseEntity<Posts> getPost(@PathVariable Long postId) {
        Posts post = postService.getPostById(postId);
        return ResponseEntity.ok(post);
    }

}
