package com.example.userserviceapplication.services;

import com.example.userserviceapplication.models.Token;
import com.example.userserviceapplication.models.User;
import com.example.userserviceapplication.repositories.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
@Service
public class UserService {
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    private UserRepository userRepository;
    UserService(BCryptPasswordEncoder bCryptPasswordEncoder,
                UserRepository userRepository) {
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
        this.userRepository = userRepository;
    }
    public User signUp(String email,
                       String name,
                       String password) {
        User user = new User();
        user.setEmail(email);
        user.setName(name);
        user.setHashedPassword(bCryptPasswordEncoder.encode(password));
        user.setEmailVerified(true);
        //save the user object to the DB.
        return userRepository.save(user);
    }
    public Token login(String email, String password) {
        return null;
    }
    public void logout(String token) {
        return;
    }
    public User validateToken(String token) {
        return null;
    }
}