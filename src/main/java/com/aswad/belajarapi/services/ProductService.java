package com.aswad.belajarapi.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aswad.belajarapi.models.entities.Product;
import com.aswad.belajarapi.models.repos.ProductRepo;

@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public Product save(Product product){
        return productRepo.save(product);
    }

    public Iterable<Product> findAll(){
        return productRepo.findAll();
    }

    public Product findById(Long id){
        return productRepo.findById(id).get();
    }

    public Product update(Product product, Long id){
        return productRepo.save(product);
    }

    public void delete(Long id){
        productRepo.deleteById(id);
    }

    public Iterable<Product> findByName(String name){
        return productRepo.findByNameContains(name);
    }

}
