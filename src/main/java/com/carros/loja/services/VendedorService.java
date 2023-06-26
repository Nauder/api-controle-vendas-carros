package com.carros.loja.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.carros.loja.models.Vendedor;
import com.carros.loja.repositories.VendedorRepository;

@Service
public class VendedorService extends BaseService<Vendedor, VendedorRepository> {

    public List<Vendedor> get(Long id, String email, String senha) {

        return email == null && senha == null ? super.get(id) : super.getRepository().findByEmailAndSenha(email, senha);
    }
}
