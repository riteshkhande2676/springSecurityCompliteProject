package com.crystaltech.springSecurityCompliteProject.controller;


import com.crystaltech.springSecurityCompliteProject.dto.requesr.UserRequestRegisterDto;
import com.crystaltech.springSecurityCompliteProject.entity.User;
import com.crystaltech.springSecurityCompliteProject.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {


    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<UserRequestRegisterDto> register(@RequestBody UserRequestRegisterDto userRequestRegisterDto) {

        UserRequestRegisterDto userRequestRegisterDto1=userService.register(userRequestRegisterDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(userRequestRegisterDto1);

    }




}
