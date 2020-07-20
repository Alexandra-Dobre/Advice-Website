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

    //TODO - lista
    @GetMapping(value = "/userid/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserDTO> findUserId(@PathVariable Integer userId){
        Optional<User> userIdOptional = userRepository.findUserByUserId(userId);

        if(!userIdOptional.isPresent()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        User myUserId = userIdOptional.get();

        UserDTO userIdDTO = new UserDTO(
                myUserId.getUserId(), myUserId.getName());

        return new ResponseEntity<>(userIdDTO, HttpStatus.OK);
    }

    //TODO - lista
    @GetMapping(value = "/username/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserDTO> findUserName(@PathVariable String name){
        Optional<User> userNameOptional = userRepository.findUsersByNameContaining(name);

        if(!userNameOptional.isPresent()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        User myUserName = userNameOptional.get();

        UserDTO userNameDTO = new UserDTO(
                myUserName.getUserId(), myUserName.getName());

        return new ResponseEntity<>(userNameDTO, HttpStatus.OK);
    }


    // TODO
//    @PostMapping(value = "/register/registerUser",
//            produces = MediaType.APPLICATION_JSON_VALUE,
//            consumes = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<UserDTO> registerUser(@RequestBody UserDTO register) {
//        User savedUser = userService.saveUser(register);
//        UserDTO userSavedDTO = new UserDTO(savedUser.getName(), savedUser.getEmail(),
//                savedUser.getPassword());
//        return new ResponseEntity<>(userSavedDTO, HttpStatus.ACCEPTED);
//    }


}
