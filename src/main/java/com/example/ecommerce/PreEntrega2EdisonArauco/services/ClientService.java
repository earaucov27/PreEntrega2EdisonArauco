package com.example.ecommerce.PreEntrega2EdisonArauco.services;

import com.example.ecommerce.PreEntrega2EdisonArauco.entities.Client;
import com.example.ecommerce.PreEntrega2EdisonArauco.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    public void saveClient(Client client) {
        repository.save(client);
    }

    public List<Client> readClients() {
        return repository.findAll();
    }

    public Optional<Client> readOneClient(Long id) {
        return repository.findById(id);
    }

    public void destroyOneClient(Long id) {
        repository.deleteById(id);
    }
}
