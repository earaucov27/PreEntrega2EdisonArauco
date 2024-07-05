package com.example.ecommerce.PreEntrega2EdisonArauco.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "invoice_details")
public class DetalleComprobante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer invoiceDetailId;

    @ManyToOne
    @JoinColumn(name = "invoice_id")
    private Comprobante comprobante;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Producto producto;

    private Integer amount;
    private Double price;
}
