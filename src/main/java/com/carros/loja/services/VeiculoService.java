package com.carros.loja.services;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.carros.loja.models.Veiculo;
import com.carros.loja.repositories.VeiculoRepository;

@Service
public class VeiculoService extends BaseService<Veiculo, VeiculoRepository> {

    public List<Map<String, Object>> getDescricao(Integer idModelo) {
        return super.getRepository().getDescricaoVeiculo(idModelo);
    }
}
