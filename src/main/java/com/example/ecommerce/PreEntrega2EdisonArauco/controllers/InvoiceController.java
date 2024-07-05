package com.example.ecommerce.PreEntrega2EdisonArauco.controllers;

import com.example.ecommerce.PreEntrega2EdisonArauco.entities.Invoice;
import com.example.ecommerce.PreEntrega2EdisonArauco.services.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="api/v1/invoices")
public class InvoiceController {

    @Autowired
    private InvoiceService service;

    @PostMapping()
    public void saveInvoice(@RequestBody Invoice invoice) {
        service.saveInvoice(invoice);
    }

    @GetMapping()
    public List<Invoice> readInvoices() {
        return service.readInvoices();
    }

    @GetMapping("/{id}")
    public Optional<Invoice> readOneInvoice(@PathVariable("id") Long id) {
        return service.readOneInvoice(id);
    }

    @DeleteMapping("/{id}")
    public void destroyOneInvoice(@PathVariable("id") Long id) {
        service.destroyOneInvoice(id);
    }
}

