package com.carros.loja.services;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.carros.loja.models.Agenda;
import com.carros.loja.repositories.AgendaRepository;

@Service
public class AgendaService extends BaseService<Agenda, AgendaRepository> {

    public List<Agenda> get(Long id, Integer idVendedor, Boolean limit) {

        final int entries = limit != null && Boolean.TRUE.equals(limit) ? 3 : 20;
        return idVendedor == null ? super.get(id)
                : super.getRepository()
                        .findByIdVendedorOrderByDataHora(idVendedor, PageRequest.of(0, entries));
    }
}
