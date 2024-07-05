package com.example.ecommerce.PreEntrega2EdisonArauco.services;

import com.example.ecommerce.PreEntrega2EdisonArauco.entities.Invoice;
import com.example.ecommerce.PreEntrega2EdisonArauco.repositories.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceService {

    @Autowired
    private InvoiceRepository repository;

    public void saveInvoice(Invoice invoice) {
        repository.save(invoice);
    }

    public List<Invoice> readInvoices() {
        return repository.findAll();
    }

    public Optional<Invoice> readOneInvoice(Long id) {
        return repository.findById(id);
    }

    public void destroyOneInvoice(Long id) {
        repository.deleteById(id);
    }
}
