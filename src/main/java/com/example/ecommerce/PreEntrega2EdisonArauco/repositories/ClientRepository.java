package com.example.ecommerce.PreEntrega2EdisonArauco.repositories;

import com.example.ecommerce.PreEntrega2EdisonArauco.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}