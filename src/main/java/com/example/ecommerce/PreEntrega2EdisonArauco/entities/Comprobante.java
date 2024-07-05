package com.example.ecommerce.PreEntrega2EdisonArauco.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "invoice")
public class Comprobante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Cliente cliente;

    private LocalDateTime createdAt;
    private Double total;

    @OneToMany(mappedBy = "comprobante", cascade = CascadeType.ALL)
    private List<DetalleComprobante> detalles;
}

