package com.example.ecommerce.PreEntrega2EdisonArauco.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "invoice")
@NoArgsConstructor @ToString @EqualsAndHashCode
public class Invoice {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter private Long id;
    @Getter @Setter private Long clientId;
    @Getter @Setter private Date createdAt;
    @Getter @Setter private Double total;
}
