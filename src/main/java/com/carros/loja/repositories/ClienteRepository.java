package com.carros.loja.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carros.loja.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    List<Cliente> findByTipo(String tipo);
}
