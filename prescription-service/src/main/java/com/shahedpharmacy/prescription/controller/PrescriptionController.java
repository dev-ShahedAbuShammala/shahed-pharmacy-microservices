package com.shahedpharmacy.prescription.controller;

import com.shahedpharmacy.prescription.entity.Prescription;
import com.shahedpharmacy.prescription.service.PrescriptionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/prescriptions")
public class PrescriptionController {

    @Autowired
    private PrescriptionService service;

    @GetMapping
    public List<Prescription> getAllPrescriptions() {
        return service.getAllPrescriptions();
    }

    @PostMapping
    public Prescription addPrescription(@RequestBody Prescription prescription) {
        return service.addPrescription(prescription);
    }

    @GetMapping("/{id}")
    public Prescription getPrescriptionById(@PathVariable Long id) {
        return service.getPrescriptionById(id);
    }

    @PutMapping("/{id}")
    public Prescription updatePrescription(@PathVariable Long id,
                                           @RequestBody Prescription prescription) {
        return service.updatePrescription(id, prescription);
    }

    @DeleteMapping("/{id}")
    public String deletePrescription(@PathVariable Long id) {
        service.deletePrescription(id);
        return "Prescription deleted successfully";
    }
}