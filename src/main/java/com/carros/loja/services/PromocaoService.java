package com.carros.loja.services;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.carros.loja.models.Promocao;
import com.carros.loja.repositories.PromocaoRepository;

@Service
public class PromocaoService extends BaseService<Promocao, PromocaoRepository> {

    public List<Promocao> get(Long id, Integer idVeiculo) {
        return idVeiculo == null ? super.get(id) : super.getRepository().findByIdVeiculo(idVeiculo);
    }

    public List<Map<String, Object>> getDescricao(Integer idModelo) {
        return super.getRepository().getDescricao(idModelo);
    }
}
