package com.hackathon.GoogleFirstResultBOOMBack.webservices.medicine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicines")
public class MedicineController {
    @Autowired MedicineService service;

    @GetMapping
    public List<Medicine> getMedicines() {
        return service.getMedicines();
    }

    @DeleteMapping("/{id}")
    public void deleteMedicine(@PathVariable Long id) {
        service.deleteMedicine(id);
    }
}
