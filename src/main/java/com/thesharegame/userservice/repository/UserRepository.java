package com.thesharegame.userservice.repository;

import com.thesharegame.userservice.entity.UserEnt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEnt, String> {

}
