package com.thesharegame.userservice.service;

import com.thesharegame.userservice.dto.UserDto;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public UserDto getUserById(long id){
        return UserDto.builder().id(id).build();
    }

    public UserDto saveUser(UserDto userDto){
        return userDto;
    }

    public void deleteUser(long id){

    }
}
