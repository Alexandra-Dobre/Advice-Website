package com.sda.adviceWebsite.service;

import com.sda.adviceWebsite.entity.DTO.user.UserDTO;
import com.sda.adviceWebsite.entity.User;
import com.sda.adviceWebsite.exception.UserDetailsFoundException;
import com.sda.adviceWebsite.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {

        this.userRepository = userRepository;
    }

    public User saveUser(UserDTO userDTO) {
        User user = new User();

        user.setName(userDTO.getUserName());
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());

        if (findByUsername(userDTO.getUserName()).isPresent()) {
            throw new UserDetailsFoundException("Person with username: " +
                    userDTO.getUserName() + " already exists");
        } else if (findByEmail(userDTO.getEmail()).isPresent()) {
            throw new UserDetailsFoundException("Person with email: " +
                    userDTO.getEmail() + " already exists");
        }
        return userRepository.save(user);
    }

    public Optional<User> findByUsername(String userName) {
        return userRepository.findUsersByNameContaining(userName);
    }

    public Optional<User> findByEmail (String email){
        return userRepository.findUsersByEmailContaining(email);
    }

   }
