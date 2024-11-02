package com.example.userserviceapplication.controllers;

import com.example.userserviceapplication.dtos.LogOutRequestDto;
import com.example.userserviceapplication.dtos.LoginRequestDto;
import com.example.userserviceapplication.dtos.SignUpRequestDto;
import com.example.userserviceapplication.dtos.UserDto;
import com.example.userserviceapplication.models.Token;
import com.example.userserviceapplication.models.User;
import com.example.userserviceapplication.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/users")
public class UserController {
    private UserService userService;
    UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/signup")
    public UserDto signUp(@RequestBody SignUpRequestDto requestDto) {
        User user = userService.signUp(
                requestDto.getEmail(),
                requestDto.getName(),
                requestDto.getPassword()
        );
        return UserDto.from(user);
    }
    @PostMapping("/login")
    public Token login(@RequestBody LoginRequestDto requestDto) {
        return null;
    }
    @PostMapping("/logout")
    public ResponseEntity<Void> logout(@RequestBody LogOutRequestDto requestDto) {
        return null;
    }
    @GetMapping("/validate/{token}")
    public UserDto validateToken(@PathVariable String token) {
        return null;
    }
    @GetMapping("/users/{id}")
    public UserDto getUserById(@PathVariable Long id) {
        return null;
    }
}