package com.carros.loja.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.carros.loja.models.Vendedor;
import com.carros.loja.services.VendedorService;

@RestController
@RequestMapping("/api/vendedor")
public class VendedorController {

    @Autowired
    private VendedorService service;

    @GetMapping
    public ResponseEntity<List<Vendedor>> get(@RequestParam(required = false) Long id,
            @RequestParam(required = false) String email,
            @RequestParam(required = false) String senha) {
        return ResponseEntity.ok().body(service.get(id, email, senha));
    }

    @PutMapping
    public ResponseEntity<Vendedor> put(@RequestBody Vendedor vendedor) {
        return ResponseEntity.ok().body(service.store(vendedor));
    }

    @DeleteMapping
    public ResponseEntity<Object> delete(@RequestParam long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
