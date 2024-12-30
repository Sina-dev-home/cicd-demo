package com.example.myproducts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdService {
    @Autowired
    ProductRepo repo;

    public List<Product> getProducts(){
        return repo.findAll();
    }

    public Product getProductById( Long prodId){
        return repo.findById(prodId).orElse(new Product());
    }

    public List<Product> createProduct( Product product){
        repo.save(product);
        return repo.findAll();
    }

    public List<Product> updateProduct( Product product){
        repo.save(product);
        return repo.findAll();
    }

    public List<Product> deleteProduct( Long prodId){
        repo.deleteById(prodId);
        return repo.findAll();
    }
}
