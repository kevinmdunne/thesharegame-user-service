package com.thesharegame.userservice.controller;

import com.thesharegame.userservice.dto.UserDto;
import com.thesharegame.userservice.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {

    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/getbyid/{id}")
    public UserDto getUserById(@PathVariable String id){
        return userService.getUserById(id);
    }

    @PostMapping("/saveuser")
    public UserDto saveUser(@RequestBody UserDto userDto){
        return userService.saveUser(userDto);
    }

    @DeleteMapping("/deleteuser/{id}")
    public void deleteUser(@PathVariable String id){
        userService.deleteUser(id);
    }

    @GetMapping("/addDummyData")
    public UserDto addDummyData(){
        return this.userService.addDummyData();
    }
}
