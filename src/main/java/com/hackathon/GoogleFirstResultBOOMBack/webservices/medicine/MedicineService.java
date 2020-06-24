package com.hackathon.GoogleFirstResultBOOMBack.webservices.medicine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicineService {

    @Autowired MedicineRepository repository;

    public List<Medicine> getMedicines() {
        return repository.findAll();
    }

    public void deleteMedicine(Long id) {
        repository.deleteById(id);
    }
}
