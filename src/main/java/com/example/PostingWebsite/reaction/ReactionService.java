package com.example.PostingWebsite.reaction;

import com.example.PostingWebsite.reaction.ReactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReactionService {
    @Autowired
    private ReactionRepository reactionRepository;

    public void reactToPost(ReactionDTO reactionDTO) {

    }
    //react to a post
}
