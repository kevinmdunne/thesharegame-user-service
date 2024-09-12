package com.thesharegame.userservice.utils;

import com.thesharegame.userservice.dto.UserDto;
import com.thesharegame.userservice.entity.UserEnt;

public class ModelConverter {

    public static UserDto convertEntToDto(UserEnt userEnt){
        return UserDto.builder()
                .id(userEnt.getId())
                .email(userEnt.getEmail())
                .password(userEnt.getPassword())
                .createDate(userEnt.getCreateDate())
                .modifyDate(userEnt.getModifyDate())
                .build();
    }

    public static UserEnt convertDtoToEnt(UserDto userDto){
        return UserEnt.builder()
                .id(userDto.getId())
                .email(userDto.getEmail())
                .password(userDto.getPassword())
                .createDate(userDto.getCreateDate())
                .modifyDate(userDto.getModifyDate())
                .build();
    }
}
