package com.example.ecommerce.PreEntrega2EdisonArauco.services;

import com.example.ecommerce.PreEntrega2EdisonArauco.entities.Product;
import com.example.ecommerce.PreEntrega2EdisonArauco.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public void saveProduct(Product product) {
        repository.save(product);
    }

    public List<Product> readProducts() {
        return repository.findAll();
    }

    public Optional<Product> readOneProduct(Long id) {
        return repository.findById(id);
    }

    public void destroyOneProduct(Long id) {
        repository.deleteById(id);
    }
}


