package com.example.ecommerce.PreEntrega2EdisonArauco.services;

import com.example.ecommerce.PreEntrega2EdisonArauco.entities.InvoiceDetail;
import com.example.ecommerce.PreEntrega2EdisonArauco.repositories.InvoiceDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceDetailService {

    @Autowired
    private InvoiceDetailRepository repository;

    public void saveInvoiceDetail(InvoiceDetail invoiceDetail) {
        repository.save(invoiceDetail);
    }

    public List<InvoiceDetail> readInvoiceDetails() {
        return repository.findAll();
    }

    public Optional<InvoiceDetail> readOneInvoiceDetail(Long id) {
        return repository.findById(id);
    }

    public void destroyOneInvoiceDetail(Long id) {
        repository.deleteById(id);
    }
}

