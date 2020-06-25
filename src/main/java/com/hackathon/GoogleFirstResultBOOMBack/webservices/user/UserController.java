package com.hackathon.GoogleFirstResultBOOMBack.webservices.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired UserService service;
    @Autowired BCryptPasswordEncoder bCryptPasswordEncoder;

    @GetMapping
    public List<ApplicationUser> getUsers() {
        return service.getUsers();
    }

    @GetMapping("/{id}")
    public ApplicationUser getUserById(@PathVariable Long id) {
        return service.getUserById(id);
    }

    @PostMapping
    public ApplicationUser postUser(@RequestBody ApplicationUser user) {
        return service.saveUser(user);
    }

    @PostMapping("/sign-up")
    public void signup(@RequestBody ApplicationUser user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        service.saveUser(user);
    }

    @PutMapping("/{id}")
    public ApplicationUser updateUser(@RequestBody ApplicationUser user, @PathVariable Long id) {
        return service.updateUser(user, id);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        service.deleteUser(id);
    }
}
