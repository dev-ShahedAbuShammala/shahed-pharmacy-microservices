package com.shahedpharmacy.supplier.service;

import com.shahedpharmacy.supplier.entity.Supplier;
import com.shahedpharmacy.supplier.repository.SupplierRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepository repository;

    public List<Supplier> getAllSuppliers() {
        return repository.findAll();
    }

    public Supplier addSupplier(Supplier supplier) {
        return repository.save(supplier);
    }

    public Supplier getSupplierById(Long id) {
        return repository.findById(id).get();
    }

    public Supplier updateSupplier(Long id, Supplier supplier) {
        Supplier oldSupplier = repository.findById(id).get();

        oldSupplier.setName(supplier.getName());
        oldSupplier.setPhone(supplier.getPhone());
        oldSupplier.setCompany(supplier.getCompany());

        return repository.save(oldSupplier);
    }

    public void deleteSupplier(Long id) {
        repository.deleteById(id);
    }
}