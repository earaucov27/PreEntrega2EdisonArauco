package com.example.ecommerce.PreEntrega2EdisonArauco.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "products")
@NoArgsConstructor @ToString @EqualsAndHashCode
public class Product {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter private Long id;
    @Getter @Setter private String description;
    @Getter @Setter private String code;
    @Getter @Setter private Integer stock;
    @Getter @Setter private Double price;
}



