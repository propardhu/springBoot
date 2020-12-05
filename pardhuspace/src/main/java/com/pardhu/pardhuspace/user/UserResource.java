package com.pardhu.pardhuspace.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserResource {

    @Autowired
    private UserDataService service;

    @GetMapping("/users")
    public List<User> retrieveAllUsers() {
        return service.findall();
    }

    @GetMapping(path = "/user/{id}")
    public User findUser(@PathVariable int id) {
        return service.findOne(id);
    }

    @PostMapping(consumes = "application/json", path = "/users")
    public void createuser(@RequestBody User user) {
        User saveUser = service.save(user);
    }
}
