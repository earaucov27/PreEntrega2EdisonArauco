package com.example.ecommerce.PreEntrega2EdisonArauco.repositories;

import com.example.ecommerce.PreEntrega2EdisonArauco.entities.InvoiceDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceDetailRepository extends JpaRepository<InvoiceDetail, Long> {
}


