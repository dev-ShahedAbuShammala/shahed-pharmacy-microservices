package com.shahedpharmacy.medicine.service;

import com.shahedpharmacy.medicine.entity.Medicine;
import com.shahedpharmacy.medicine.repository.MedicineRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicineService {

    @Autowired
    private MedicineRepository repository;

    public List<Medicine> getAllMedicines() {
        return repository.findAll();
    }

    public Medicine saveMedicine(Medicine medicine) {
        return repository.save(medicine);
    }

    public Medicine getMedicineById(Long id) {
        return repository.findById(id).get();
    }

    public Medicine updateMedicine(Long id, Medicine medicine) {
        Medicine oldMedicine = repository.findById(id).get();

        oldMedicine.setName(medicine.getName());
        oldMedicine.setCategory(medicine.getCategory());
        oldMedicine.setPrice(medicine.getPrice());
        oldMedicine.setQuantity(medicine.getQuantity());

        return repository.save(oldMedicine);
    }

    public void deleteMedicine(Long id) {
        repository.deleteById(id);
    }
}
