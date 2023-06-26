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
public class Modelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idModelo;

    @Column
    private String nome;

    @Column
    private Integer idMarca;

    @Column
    private String ano;

    @Column
    private String codigoFipe;

    @Column
    private Integer numeroPortas;

    @Column
    private Integer numeroAssentos;

    @Column
    private String possuiAr;

    @Column
    private Double quilometragem;
}
