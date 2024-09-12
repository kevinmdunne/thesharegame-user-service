package com.thesharegame.userservice.dto;

import lombok.Builder;
import lombok.Data;

import java.time.Instant;

@Data
@Builder
public class UserDto {

    private String id;
    private String email;
    private String password;
    private Instant createDate;
    private Instant modifyDate;
}
