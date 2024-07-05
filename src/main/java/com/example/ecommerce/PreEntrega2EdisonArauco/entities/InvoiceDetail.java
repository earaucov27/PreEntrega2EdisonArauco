package com.example.ecommerce.PreEntrega2EdisonArauco.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "invoice_details")
@NoArgsConstructor @ToString @EqualsAndHashCode
public class InvoiceDetail {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter private Long invoiceDetailId;
    @Getter @Setter private Long invoiceId;
    @Getter @Setter private Long productId;
    @Getter @Setter private Integer amount;
    @Getter @Setter private Double price;
}

