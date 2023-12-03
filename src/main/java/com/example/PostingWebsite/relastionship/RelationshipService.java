package com.example.PostingWebsite.relastionship;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RelationshipService {
    @Autowired
    private RelationshipRepository relationshipRepository;

    public void sendFriendRequest(FriendshipRequestDTO requestDTO) {
        
    }

    public void acceptFriendRequest(Long friendshipId) {
    }
    //send, accept ,delete request
}
