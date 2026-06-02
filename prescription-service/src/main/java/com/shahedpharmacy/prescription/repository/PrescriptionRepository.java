package com.shahedpharmacy.prescription.repository;

import com.shahedpharmacy.prescription.entity.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrescriptionRepository extends JpaRepository<Prescription, Long> {

}