package com.sda.adviceWebsite.controller;

import com.sda.adviceWebsite.entity.DTO.user.UserDTO;
import com.sda.adviceWebsite.entity.User;
import com.sda.adviceWebsite.repository.UserRepository;
import com.sda.adviceWebsite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    public UserRepository userRepository;

    @Autowired
    public UserService userService;

    @GetMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserDTO> user(){
        Optional<User> myUser = userRepository.findUsersByNameContaining("tom");

        if(!myUser.isPresent()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        User userFromOptional = myUser.get();

        UserDTO dto = new UserDTO(
                userFromOptional.getUserId(), userFromOptional.getName(), "14 July 2020");

        return new ResponseEntity<>(dto, HttpStatus.OK);
    }


}
