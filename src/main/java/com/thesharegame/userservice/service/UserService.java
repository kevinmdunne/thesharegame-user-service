package com.thesharegame.userservice.service;

import com.thesharegame.userservice.dto.UserDto;
import com.thesharegame.userservice.entity.UserEnt;
import com.thesharegame.userservice.repository.UserRepository;
import com.thesharegame.userservice.utils.ModelConverter;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public UserDto getUserById(long id){
        UserEnt userEnt = userRepository.getReferenceById(id);
        return ModelConverter.convertEntToDto(userEnt);
    }

    public UserDto saveUser(UserDto userDto){
        UserEnt userEnt = ModelConverter.convertDtoToEnt(userDto);
        UserEnt savedEnt = userRepository.save(userEnt);
        return ModelConverter.convertEntToDto(savedEnt);
    }

    public void deleteUser(long id){
        userRepository.deleteById(id);
    }
}
