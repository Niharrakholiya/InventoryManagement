package com.example.demo.Services;
import com.example.demo.Entity.Category;
import com.example.demo.Repository.CategoryRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }
    @Transactional
    public List<Category> addCategories(List<Category> categories) {
        return categoryRepository.saveAll(categories);
    }
    @Transactional
    public Category addCategory (Category categorie) {
        return categoryRepository.save(categorie);
    }
    public Category updateCategory(Long id, Category category) {
        Category existingCategory = categoryRepository.findById(id).orElse(null);
        if (existingCategory != null) {
            // Update existing category with new values
            existingCategory.setName(category.getName());
            existingCategory.setDescription(category.getDescription());
            return categoryRepository.save(existingCategory);
        }
        return null; // Category with given ID not found
    }

    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }


    public Category findById(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }
}
