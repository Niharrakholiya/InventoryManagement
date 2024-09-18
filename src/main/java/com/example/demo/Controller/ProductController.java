package com.example.demo.Controller;

import com.example.demo.Entity.Category;
import com.example.demo.Entity.Product;
import com.example.demo.Entity.Supplier;
import com.example.demo.Services.CategoryService;
import com.example.demo.Services.ProductService;
import com.example.demo.Services.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/products")
    public class ProductController {

    @Autowired
    private ProductService productService;



    @PostMapping("")
    public List<Product> addproduct(@RequestBody List<Product> product){
        return productService.addProduct(product);
    }

        @GetMapping
        public List<Product> getAllProducts() {
            return productService.getAllProducts();
        }

        @GetMapping("/{id}")
        public Product getProductById(@PathVariable Long id) {
            return productService.getProductById(id);
        }



        @PutMapping("/{id}")
        public Product updateProduct(@PathVariable Long id, @RequestBody Product product) {
            return productService.updateProduct(id, product);
        }

        @DeleteMapping("/{id}")
        public void deleteProduct(@PathVariable Long id) {
            productService.deleteProduct(id);
        }
    }
