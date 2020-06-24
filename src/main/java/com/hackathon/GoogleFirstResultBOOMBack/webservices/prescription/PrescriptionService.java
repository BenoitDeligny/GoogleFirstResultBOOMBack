package com.hackathon.GoogleFirstResultBOOMBack.webservices.prescription;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrescriptionService {

    @Autowired
    PrescriptionRepository repository;

    public List<Prescription> getPrescriptions() {
        return repository.findAll();
    }

    public Prescription getPrescriptionById(Long id) {
        return repository.findById(id).get();
    }

    public Prescription savePrescription(Prescription prescription) {
        return repository.save(prescription);
    }

    public Prescription updatePrescription(Prescription prescription, Long id) {
        Prescription updatedPrescription = repository.findById(id).get();

        updatedPrescription.setDateCreation(prescription.getDateCreation());
        updatedPrescription.setAuthor(prescription.getAuthor());
        updatedPrescription.setUser(prescription.getUser());

        return repository.save(updatedPrescription);
    }

    public void deletePrescription(Long id) {
        repository.deleteById(id);
    }
}
