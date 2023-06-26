package com.carros.loja.services;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.carros.loja.models.Modelo;
import com.carros.loja.repositories.ModeloRepository;

@Service
public class ModeloService extends BaseService<Modelo, ModeloRepository> {

    public List<Map<String, Object>> getDescricao(Integer idMarca) {
        return super.getRepository().getDescricaoModelo(idMarca);
    }
}