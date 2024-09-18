package com.example.demo.Services;


import com.example.demo.Entity.Supplier;
import com.example.demo.Repository.SupplierRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    public List<Supplier> getAllSuppliers() {
        return supplierRepository.findAll();
    }

    public Supplier getSupplierById(Long id) {
        return supplierRepository.findById(id).orElse(null);
    }
    @Transactional
    public List<Supplier> addSuppliers(List<Supplier> suppliers) {
        // Add any additional logic here (e.g., validation)
        return supplierRepository.saveAll(suppliers);
    }
    @Transactional
    public Supplier addSupplier (Supplier supplier) {
        // Add any additional logic here (e.g., validation)
        return supplierRepository.save(supplier);
    }

    public Supplier updateSupplier(Long id, Supplier supplier) {
        // Add any additional logic here (e.g., validation)
        supplier.setId(id);
        return supplierRepository.save(supplier);
    }

    public void deleteSupplier(Long id) {
        // Add any additional logic here (e.g., check if supplier exists before deleting)
        supplierRepository.deleteById(id);
    }

    public Supplier findById(Long id) {
        return supplierRepository.findById(id).orElse(null);
    }
}
