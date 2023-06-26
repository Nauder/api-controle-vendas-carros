package com.carros.loja.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.carros.loja.models.Venda;
import com.carros.loja.repositories.VendaRepository;

@Service
public class VendaService extends BaseService<Venda, VendaRepository> {

    public List<Venda> get(Long id, Integer idVeiculo) {

        return idVeiculo == null ? super.get(id) : super.getRepository().findByIdVeiculo(idVeiculo);
    }
}
