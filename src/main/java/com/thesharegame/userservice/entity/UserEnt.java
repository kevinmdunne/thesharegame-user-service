package com.thesharegame.userservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.UuidGenerator;

@Entity
@Table(name="users")
@Data
@Builder
@AllArgsConstructor
public class UserEnt {

    public UserEnt(){}

    @Id
    @UuidGenerator(style = UuidGenerator.Style.RANDOM)
    private String id;

    @Column(name="email", length=100, nullable=false)
    private String email;

    @Column(name="password", length=100, nullable=false)
    private String password;
}
