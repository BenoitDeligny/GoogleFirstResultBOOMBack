package com.hackathon.GoogleFirstResultBOOMBack.webservices.applicationUser;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<ApplicationUser, Long> {
    ApplicationUser findByUsername(String username);
    ApplicationUser findByLastname(String lastname);
}
