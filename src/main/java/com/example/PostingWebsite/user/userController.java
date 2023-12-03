package com.example.PostingWebsite.user;

import com.example.PostingWebsite.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class userController {

    private UserService userService;
    @Autowired
    public userController(UserService userService){this.userService = userService;}

@GetMapping
public ResponseEntity<User> getUser(@PathVariable String username) {
    User user = userService.getUserByUsername(username);
    return ResponseEntity.ok(user);
    }

    @PostMapping
    public ResponseEntity<String> signUp(@RequestBody UserDTO userDTO) {
        userService.signUp(userDTO);
        return ResponseEntity.ok("User registered successfully");
    }








}
