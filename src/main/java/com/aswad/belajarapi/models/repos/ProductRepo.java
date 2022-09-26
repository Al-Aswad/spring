package com.aswad.belajarapi.models.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.aswad.belajarapi.models.entities.Product;

public interface ProductRepo extends CrudRepository<Product, Long> {

    public List<Product> findByNameContains(String name);
    
}
