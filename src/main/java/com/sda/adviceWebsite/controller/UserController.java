package com.sda.adviceWebsite.controller;

import com.sda.adviceWebsite.repository.UserRepository;
import com.sda.adviceWebsite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/adviceWebsite/v1/user")
public class UserController {

    @Autowired
    public UserRepository userRepository;

    @Autowired
    public UserService userService;


}
