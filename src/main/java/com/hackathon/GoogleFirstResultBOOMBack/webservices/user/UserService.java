package com.hackathon.GoogleFirstResultBOOMBack.webservices.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired UserRepository repository;

    public List<User> getUsers() {
        return repository.findAll();
    }

    public User getUserById(Long id) {
        return repository.findById(id).get();
    }

    public User saveUser(User user) {
        return repository.save(user);
    }

    public User updateUser(User user, Long id) {
        User updatedUser = repository.findById(id).get();

        updatedUser.setLastname(user.getLastname());
        updatedUser.setFirstname(user.getFirstname());
        updatedUser.setEmail(user.getEmail());
        updatedUser.setBirthdate(user.getBirthdate());
        updatedUser.setPrescriptions(user.getPrescriptions());

        return repository.save(updatedUser);
    }

    public void deleteUser(Long id) {
        repository.deleteById(id);
    }
}
