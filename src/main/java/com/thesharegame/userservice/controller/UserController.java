package com.thesharegame.userservice.controller;

import com.thesharegame.userservice.dto.UserDto;
import com.thesharegame.userservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
@Slf4j
public class UserController {

    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/getbyid/{id}")
    public UserDto getUserById(@PathVariable String id){
        log.info("Calling getUserById");
        return userService.getUserById(id);
    }

    @PostMapping("/saveuser")
    public UserDto saveUser(@RequestBody UserDto userDto){
        log.info("Calling saveUser");
        return userService.saveUser(userDto);
    }

    @DeleteMapping("/deleteuser/{id}")
    public void deleteUser(@PathVariable String id){
        log.info("Calling deleteUser");
        userService.deleteUser(id);
    }

    @GetMapping("/addDummyData")
    public UserDto addDummyData(){
        log.info("Calling addDummyData");
        return this.userService.addDummyData();
    }
}
