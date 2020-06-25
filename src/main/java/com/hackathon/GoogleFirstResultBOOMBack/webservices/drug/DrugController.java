package com.hackathon.GoogleFirstResultBOOMBack.webservices.drug;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicines")
public class DrugController {
    @Autowired
    DrugService service;

    @GetMapping
    public List<Drug> getMedicines() {
        return service.getMedicines();
    }

    @DeleteMapping("/{id}")
    public void deleteMedicine(@PathVariable Long id) {
        service.deleteMedicine(id);
    }
}
