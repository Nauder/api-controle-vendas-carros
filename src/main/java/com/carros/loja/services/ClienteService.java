package com.carros.loja.services;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.carros.loja.models.Cliente;
import com.carros.loja.repositories.ClienteRepository;

@Service
public class ClienteService extends BaseService<Cliente, ClienteRepository> {

    public List<Cliente> get(Long id, String tipo) {

        if (id == null) {
            return tipo == null ? super.getRepository().findAll() : super.getRepository().findByTipo(tipo);
        }

        final List<Cliente> list = new LinkedList<>();
        super.getRepository().findById(id).ifPresent(list::add);
        return list;
    }
}
