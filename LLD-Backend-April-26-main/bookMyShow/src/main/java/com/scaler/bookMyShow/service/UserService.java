package com.scaler.bookMyShow.service;

import com.scaler.bookMyShow.Repository.UserRepository;
import com.scaler.bookMyShow.model.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User signup(String name,
                       String email,
                       String password) {

       Optional<User> userOptional = userRepository.findByEmail(email);
       if(!userOptional.isEmpty()) {
           throw new RuntimeException("Email is already used"+ email);
       }


       BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        User user = new User();
       user.setName(name);
       user.setEmail(email);
       user.setPassword(passwordEncoder.encode(password));

        return userRepository.save(user);

    }
}
