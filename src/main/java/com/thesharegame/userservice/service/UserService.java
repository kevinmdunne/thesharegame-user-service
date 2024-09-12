package com.thesharegame.userservice.service;

import com.thesharegame.userservice.dto.UserDto;
import com.thesharegame.userservice.entity.UserEnt;
import com.thesharegame.userservice.repository.UserRepository;
import com.thesharegame.userservice.utils.ModelConverter;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public UserDto getUserById(String id){
        Optional<UserEnt> userEnt = this.userRepository.findById(id);
        return ModelConverter.convertEntToDto(userEnt.get());
    }

    public UserDto saveUser(UserDto userDto){
        UserEnt userEnt = ModelConverter.convertDtoToEnt(userDto);
        UserEnt savedEnt = userRepository.save(userEnt);
        return ModelConverter.convertEntToDto(savedEnt);
    }

    public void deleteUser(String id){
        userRepository.deleteById(id);
    }

    public UserDto addDummyData(){
        UserEnt userEnt = new UserEnt();
        userEnt.setEmail("dummy@dummy.com");
        userEnt.setPassword("password1");
        UserEnt savedEnt = this.userRepository.save(userEnt);
        return ModelConverter.convertEntToDto(savedEnt);
    }
}
