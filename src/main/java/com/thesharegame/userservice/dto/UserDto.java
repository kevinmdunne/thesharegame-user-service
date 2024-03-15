package com.thesharegame.userservice.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDto {

    private String id;
    private String email;
    private String password;
}
