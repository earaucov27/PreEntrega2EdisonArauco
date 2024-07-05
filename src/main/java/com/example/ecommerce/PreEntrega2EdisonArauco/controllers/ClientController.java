package com.example.ecommerce.PreEntrega2EdisonArauco.controllers;

import com.example.ecommerce.PreEntrega2EdisonArauco.entities.Client;
import com.example.ecommerce.PreEntrega2EdisonArauco.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="api/v1/clients")
public class ClientController {

    @Autowired
    private ClientService service;

    @PostMapping()
    public void saveClient(@RequestBody Client client) {
        service.saveClient(client);
    }

    @GetMapping()
    public List<Client> readClients() {
        return service.readClients();
    }

    @GetMapping("/{id}")
    public Optional<Client> readOneClient(@PathVariable("id") Long id) {
        return service.readOneClient(id);
    }

    @DeleteMapping("/{id}")
    public void destroyOneClient(@PathVariable("id") Long id) {
        service.destroyOneClient(id);
    }
}
