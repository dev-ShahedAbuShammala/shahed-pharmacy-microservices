package com.shahedpharmacy.customer.repository;

import com.shahedpharmacy.customer.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}