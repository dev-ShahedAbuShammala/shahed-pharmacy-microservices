package com.shahedpharmacy.customer.service;

import com.shahedpharmacy.customer.entity.Customer;
import com.shahedpharmacy.customer.repository.CustomerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repository;

    public List<Customer> getAllCustomers() {
        return repository.findAll();
    }

    public Customer addCustomer(Customer customer) {
        return repository.save(customer);
    }

    public Customer getCustomerById(Long id) {
        return repository.findById(id).get();
    }

    public Customer updateCustomer(Long id, Customer customer) {
        Customer oldCustomer = repository.findById(id).get();

        oldCustomer.setName(customer.getName());
        oldCustomer.setPhone(customer.getPhone());
        oldCustomer.setAddress(customer.getAddress());

        return repository.save(oldCustomer);
    }

    public void deleteCustomer(Long id) {
        repository.deleteById(id);
    }
}