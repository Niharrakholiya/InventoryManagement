package com.example.demo.Services;

import com.example.demo.Entity.Product;
import com.example.demo.Repository.CategoryRepository;
import com.example.demo.Repository.ProductRepository;
import com.example.demo.Repository.SupplierRepository;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ProductService {



    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private SupplierRepository supplierRepository;


    @Transactional
    public List<Product> addProducts(List<Product> products) {
        return productRepository.saveAll(products);
    }

    @Transactional
    public List<Product> addProduct(List<Product>  product) {
        return productRepository.saveAll(product);
    }

    public Product updateProduct(Long id, Product product) {
        // Add any additional logic here (e.g., validation)
        product.setId(id);
        return productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        // Add any additional logic here (e.g., check if product exists before deleting)
        productRepository.deleteById(id);
    }
}
