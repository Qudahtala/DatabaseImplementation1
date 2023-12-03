package com.example.PostingWebsite.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public void signUp(UserDTO userDTO){

    }
    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

}
