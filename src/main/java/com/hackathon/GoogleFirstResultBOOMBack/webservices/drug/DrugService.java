package com.hackathon.GoogleFirstResultBOOMBack.webservices.drug;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrugService {

    @Autowired
    DrugRepository repository;

    public List<Drug> getMedicines() {
        return repository.findAll();
    }

    public void deleteMedicine(Long id) {
        repository.deleteById(id);
    }
}
