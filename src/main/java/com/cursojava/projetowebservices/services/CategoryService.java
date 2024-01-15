package com.cursojava.projetowebservices.services;

import com.cursojava.projetowebservices.entities.Category;
import com.cursojava.projetowebservices.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category findById(long id) {
        Optional<Category> category = categoryRepository.findById(id);
        return category.get();
    }


}
