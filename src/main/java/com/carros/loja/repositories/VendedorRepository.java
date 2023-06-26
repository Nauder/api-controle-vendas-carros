package com.carros.loja.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carros.loja.models.Vendedor;

public interface VendedorRepository extends JpaRepository<Vendedor, Long> {

    public List<Vendedor> findByEmailAndSenha(String email, String senha);
}
