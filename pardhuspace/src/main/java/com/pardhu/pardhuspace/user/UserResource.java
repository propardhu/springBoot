package com.pardhu.pardhuspace.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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
        User user = service.findOne(id);
        if(user == null){
            throw new UserNotFoundException("id-"+ id);
        }
        return user;
    }

    @PostMapping(consumes = "application/json", path = "/users")//Post request accepts app/json inputs
    public ResponseEntity<Object> createuser(@RequestBody User user) {
        User saveUser = service.save(user);
        //After Created sending response
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(saveUser.getId()).toUri();
        return ResponseEntity.created(location).build();
    }
}
