package com.shahedpharmacy.medicine.controller;

import com.shahedpharmacy.medicine.entity.Medicine;
import com.shahedpharmacy.medicine.service.MedicineService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicines")
public class MedicineController {

    @Autowired
    private MedicineService service;

    @GetMapping
    public List<Medicine> getAllMedicines() {
        return service.getAllMedicines();
    }

    @PostMapping
    public Medicine addMedicine(@RequestBody Medicine medicine) {
        return service.saveMedicine(medicine);
    }

    @GetMapping("/{id}")
    public Medicine getMedicineById(@PathVariable Long id) {
        return service.getMedicineById(id);
    }

    @PutMapping("/{id}")
    public Medicine updateMedicine(@PathVariable Long id, @RequestBody Medicine medicine) {
        return service.updateMedicine(id, medicine);
    }

    @DeleteMapping("/{id}")
    public String deleteMedicine(@PathVariable Long id) {
        service.deleteMedicine(id);
        return "Medicine deleted successfully";
    }
}
