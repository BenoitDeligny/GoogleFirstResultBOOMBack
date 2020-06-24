package com.hackathon.GoogleFirstResultBOOMBack.webservices.prescription;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prescriptions")
public class PrescriptionController {

    @Autowired
    PrescriptionService service;

    @GetMapping
    public List<Prescription> getPrescriptions() {
        return service.getPrescriptions();
    }

    @GetMapping("/{id}")
    public Prescription getPrescriptionById(@PathVariable Long id) {
        return service.getPrescriptionById(id);
    }

    @PostMapping
    public Prescription postPrescription(@RequestBody Prescription prescription) {
        return service.savePrescription(prescription);
    }

    @PutMapping("/{id}")
    public Prescription updatePrescription(@RequestBody Prescription prescription, @PathVariable Long id) {
        return service.updatePrescription(prescription, id);
    }

    @DeleteMapping("/{id}")
    public void deletePrescritpion(@PathVariable Long id) {
        service.deletePrescription(id);
    }
}
