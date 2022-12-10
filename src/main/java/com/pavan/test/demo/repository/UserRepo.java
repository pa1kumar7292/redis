package com.pavan.test.demo.repository;

import com.pavan.test.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepo extends JpaRepository<User, Long> {
    List<User> findByName(String name);
}
