package com.example.PostingWebsite.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class postService {
    @Autowired
    private PostRepository postRepository;

    public static void createPost(PostDTO postDTO) {
    }

    public static Posts getPostById(Long postId) {
        return null;
    }

    //create post,getpost

}
