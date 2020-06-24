package com.hackathon.GoogleFirstResultBOOMBack.webservices.prescription;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PrescriptionRepository extends JpaRepository<Prescription, Long> {
}
