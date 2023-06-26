package com.carros.loja.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.carros.loja.models.Modelo;

public interface ModeloRepository extends JpaRepository<Modelo, Long> {

    @Query(value = "SELECT marca.nome AS nome_marca, modelo.nome AS nome_modelo, modelo.ano " +
            "FROM modelo " +
            "INNER JOIN marca USING(id_marca) " +
            "WHERE marca.id_marca = ?1", nativeQuery = true)
    List<Map<String, Object>> getDescricaoModelo(Integer idMarca);
}
