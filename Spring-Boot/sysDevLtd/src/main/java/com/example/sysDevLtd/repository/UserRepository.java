package com.example.sysDevLtd.repository;

import com.example.sysDevLtd.entity.model.userA.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

  Optional<User> findByEmail(String email);

}
