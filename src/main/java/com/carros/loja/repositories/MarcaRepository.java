package com.carros.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carros.loja.models.Marca;

public interface MarcaRepository extends JpaRepository<Marca, Long> {

}
