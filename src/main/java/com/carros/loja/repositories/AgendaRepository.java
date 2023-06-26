package com.carros.loja.repositories;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.carros.loja.models.Agenda;

public interface AgendaRepository extends JpaRepository<Agenda, Long> {

    List<Agenda> findByIdVendedorOrderByDataHora(Integer idVendedor, Pageable pageable);
}
