package com.example.PostingWebsite.reaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/reactions")
public class reactionController {

    @Autowired
    private ReactionService reactionService;

    @PostMapping
    public ResponseEntity<String> reactToPost(@RequestBody ReactionDTO reactionDTO) {
        reactionService.reactToPost(reactionDTO);
        return ResponseEntity.ok("Reaction added successfully");
    }
}

