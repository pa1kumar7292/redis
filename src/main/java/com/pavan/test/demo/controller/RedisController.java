package com.pavan.test.demo.controller;

import com.pavan.test.demo.entity.User;
import com.pavan.test.demo.repository.UserRepo;
import com.pavan.test.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class RedisController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepo userRepo;

    @PostMapping("/user")
    public User saveUser(@RequestBody User user) {
        log.info("Saving user with ID {}.", user.getId());
        return userRepo.save(user);
    }

    //@Cacheable(cacheNames = "myControlledCache", key = "#userId")
    @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    public User getUser(@PathVariable Long userId) {
        log.info("Getting user with ID {}.", userId);
        return userRepo.findById(userId).get();
    }

    //@Cacheable(cacheNames = "thirtySec", key = "#userName")
    @RequestMapping(value = "/user/{userName}", method = RequestMethod.GET)
    public List<User> getUserByName(@PathVariable String userName) {
        log.info("Getting user with name {}.", userName);
        return userRepo.findByName(userName);
    }

}
