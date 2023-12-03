package com.example.PostingWebsite.relastionship;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/friendships")
public class relationshipController {

    @Autowired
    private RelationshipService relationshipService ;

    @PostMapping("/request")
    public ResponseEntity<String> sendFriendRequest(@RequestBody FriendshipRequestDTO requestDTO) {
        relationshipService.sendFriendRequest(requestDTO);
        return ResponseEntity.ok("Friend request sent successfully");
    }

    @PostMapping("/accept/{friendshipId}")
    public ResponseEntity<String> acceptFriendRequest(@PathVariable Long friendshipId) {
        relationshipService.acceptFriendRequest(friendshipId);
        return ResponseEntity.ok("Friend request accepted successfully");
    }

    // Other friendship-related endpoints
}


