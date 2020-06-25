package com.hackathon.GoogleFirstResultBOOMBack.webservices.applicationUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired UserRepository repository;

    public List<ApplicationUser> getUsers() {
        return repository.findAll();
    }

    public ApplicationUser getUserById(Long id) {
        return repository.findById(id).get();
    }

    public ApplicationUser getUserByLastname(String lastname) {
        return repository.findByLastname(lastname);
    }

    public ApplicationUser saveUser(ApplicationUser user) {
        return repository.save(user);
    }

    public ApplicationUser updateUser(ApplicationUser user, Long id) {
        ApplicationUser updatedUser = repository.findById(id).get();

        updatedUser.setUsername(user.getUsername());
        updatedUser.setLastname(user.getLastname());
        updatedUser.setFirstname(user.getFirstname());
        updatedUser.setPassword(user.getPassword());
        updatedUser.setEmail(user.getEmail());
        updatedUser.setBirthdate(user.getBirthdate());
        updatedUser.setPrescriptions(user.getPrescriptions());

        return repository.save(updatedUser);
    }

    public void deleteUser(Long id) {
        repository.deleteById(id);
    }
}
