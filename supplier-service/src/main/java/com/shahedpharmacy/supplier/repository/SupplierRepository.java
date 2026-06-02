package com.shahedpharmacy.supplier.repository;

import com.shahedpharmacy.supplier.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {

}