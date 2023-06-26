package com.carros.loja.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carros.loja.models.Venda;

public interface VendaRepository extends JpaRepository<Venda, Long> {

    List<Venda> findByIdVeiculo(Integer idVeiculo);

}
