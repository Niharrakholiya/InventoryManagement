package com.example.demo.Services;


import com.example.demo.Entity.Customer;
import com.example.demo.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public List<Customer> addCustomers(List<Customer> customer) {
        // Add any additional logic here (e.g., validation)
        return customerRepository.saveAll(customer);
    }

    public Customer updateCustomer(int id, Customer customer) {
        // Add any additional logic here (e.g., validation)
        customer.setId(id);
        return customerRepository.save(customer);
    }

    public void deleteCustomer(Long id) {
        // Add any additional logic here (e.g., check if customer exists before deleting)
        customerRepository.deleteById(id);
    }
}
