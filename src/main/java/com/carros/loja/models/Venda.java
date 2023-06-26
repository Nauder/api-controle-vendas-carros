package com.carros.loja.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idVenda;

    @Column
    private Integer idVeiculo;

    @Column
    private Integer idCliente;

    @Column
    private Integer idVendedor;

    @Column
    private Double entrada;

    @Column
    private String data;

    @Column
    private Integer parcelas;
}
