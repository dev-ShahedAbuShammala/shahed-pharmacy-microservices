package com.shahedpharmacy.prescription.service;

import com.shahedpharmacy.prescription.entity.Prescription;
import com.shahedpharmacy.prescription.repository.PrescriptionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrescriptionService {

    @Autowired
    private PrescriptionRepository repository;

    public List<Prescription> getAllPrescriptions() {
        return repository.findAll();
    }

    public Prescription addPrescription(Prescription prescription) {
        return repository.save(prescription);
    }

    public Prescription getPrescriptionById(Long id) {
        return repository.findById(id).get();
    }

    public Prescription updatePrescription(Long id, Prescription prescription) {
        Prescription oldPrescription = repository.findById(id).get();

        oldPrescription.setPatientName(prescription.getPatientName());
        oldPrescription.setDoctorName(prescription.getDoctorName());
        oldPrescription.setMedicineName(prescription.getMedicineName());
        oldPrescription.setQuantity(prescription.getQuantity());
        oldPrescription.setPrescriptionDate(prescription.getPrescriptionDate());

        return repository.save(oldPrescription);
    }

    public void deletePrescription(Long id) {
        repository.deleteById(id);
    }
}