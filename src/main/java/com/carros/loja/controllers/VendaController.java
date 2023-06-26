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

import com.carros.loja.models.Venda;
import com.carros.loja.services.VendaService;

@RestController
@RequestMapping("/api/venda")
public class VendaController {

    @Autowired
    private VendaService service;

    @GetMapping
    public ResponseEntity<List<Venda>> get(@RequestParam(required = false) Long id,
            @RequestParam(required = false) Integer idVeiculo) {
        return ResponseEntity.ok().body(service.get(id, idVeiculo));
    }

    @PutMapping
    public ResponseEntity<Venda> put(@RequestBody Venda venda) {
        return ResponseEntity.ok().body(service.store(venda));
    }

    @DeleteMapping
    public ResponseEntity<Object> delete(@RequestParam long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
