package com.example.ecommerce.PreEntrega2EdisonArauco.controllers;

import com.example.ecommerce.PreEntrega2EdisonArauco.entities.InvoiceDetail;
import com.example.ecommerce.PreEntrega2EdisonArauco.services.InvoiceDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="api/v1/invoice-details")
public class InvoiceDetailController {

    @Autowired
    private InvoiceDetailService service;

    @PostMapping()
    public void saveInvoiceDetail(@RequestBody InvoiceDetail invoiceDetail) {
        service.saveInvoiceDetail(invoiceDetail);
    }

    @GetMapping()
    public List<InvoiceDetail> readInvoiceDetails() {
        return service.readInvoiceDetails();
    }

    @GetMapping("/{id}")
    public Optional<InvoiceDetail> readOneInvoiceDetail(@PathVariable("id") Long id) {
        return service.readOneInvoiceDetail(id);
    }

    @DeleteMapping("/{id}")
    public void destroyOneInvoiceDetail(@PathVariable("id") Long id) {
        service.destroyOneInvoiceDetail(id);
    }
}

