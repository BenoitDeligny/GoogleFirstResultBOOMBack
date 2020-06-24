package com.hackathon.GoogleFirstResultBOOMBack.webservices.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired UserService service;

    @GetMapping
    public List<User> getUsers() {
        return service.getUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return service.getUserById(id);
    }

    @PostMapping
    public User postUser(@RequestBody User user) {
        return service.saveUser(user);
    }

    @PutMapping("/{id}")
    public User updateUser(@RequestBody User user, @PathVariable Long id) {
        return service.updateUser(user, id);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        service.deleteUser(id);
    }
}
