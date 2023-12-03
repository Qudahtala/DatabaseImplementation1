package com.example.PostingWebsite.post;

import com.example.PostingWebsite.post.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Posts, Long> {
    // query methods later
}

