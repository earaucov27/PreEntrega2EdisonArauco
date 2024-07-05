package com.example.ecommerce.PreEntrega2EdisonArauco.services;

import com.example.ecommerce.PreEntrega2EdisonArauco.entities.Producto;
import com.example.ecommerce.PreEntrega2EdisonArauco.repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public Producto createProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    public List<Producto> getAllProductos() {
        return productoRepository.findAll();
    }

    public Optional<Producto> getProductoById(Integer id) {
        return productoRepository.findById(id);
    }

    public Producto updateProducto(Integer id, Producto productoDetails) {
        Producto producto = productoRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Producto not found"));
        producto.setDescription(productoDetails.getDescription());
        producto.setCode(productoDetails.getCode());
        producto.setStock(productoDetails.getStock());
        producto.setPrice(productoDetails.getPrice());
        return productoRepository.save(producto);
    }
}

