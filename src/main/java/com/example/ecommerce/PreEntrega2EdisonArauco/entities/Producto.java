package com.example.ecommerce.PreEntrega2EdisonArauco.entities;

import jakarta.persistence.*;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "products")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String description;
    private String code;
    private Integer stock;
    private Double price;
}

