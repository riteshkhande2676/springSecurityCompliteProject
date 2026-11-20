package com.crystaltech.springSecurityCompliteProject.service;

import com.crystaltech.springSecurityCompliteProject.dto.requesr.UserRequestRegisterDto;
import com.crystaltech.springSecurityCompliteProject.dto.response.UserResponseRegisterDto;
import com.crystaltech.springSecurityCompliteProject.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService
{


    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserResponseRegisterDto register(UserRequestRegisterDto userRequestRegisterDto) {
        UserResponseRegisterDto userResponseRegisterDto  =userRepository.save(userRequestRegisterDto);
        return userResponseRegisterDto;
    }
}
