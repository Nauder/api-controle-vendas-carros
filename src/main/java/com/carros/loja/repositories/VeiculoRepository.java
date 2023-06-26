package com.carros.loja.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.carros.loja.models.Veiculo;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {

    @Query(value = "SELECT marca.nome AS nome_marca, modelo.nome AS nome_modelo, modelo.ano " +
            "FROM modelo " +
            "INNER JOIN marca USING(id_marca) " +
            "WHERE modelo.id_modelo = ?1", nativeQuery = true)
    List<Map<String, Object>> getDescricaoVeiculo(Integer idModelo);
}
