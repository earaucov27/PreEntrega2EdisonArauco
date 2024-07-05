package com.example.ecommerce.PreEntrega2EdisonArauco.repositories;

import com.example.ecommerce.PreEntrega2EdisonArauco.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
}