package com.example.ecommerce.PreEntrega2EdisonArauco.controllers;

import com.example.ecommerce.PreEntrega2EdisonArauco.entities.Product;
import com.example.ecommerce.PreEntrega2EdisonArauco.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="api/v1/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping()
    public void saveProduct(@RequestBody Product product) {
        service.saveProduct(product);
    }

    @GetMapping()
    public List<Product> readProducts() {
        return service.readProducts();
    }

    @GetMapping("/{id}")
    public Optional<Product> readOneProduct(@PathVariable("id") Long id) {
        return service.readOneProduct(id);
    }

    @DeleteMapping("/{id}")
    public void destroyOneProduct(@PathVariable("id") Long id) {
        service.destroyOneProduct(id);
    }
}

