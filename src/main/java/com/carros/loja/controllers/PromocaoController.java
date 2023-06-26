package com.carros.loja.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.carros.loja.models.Promocao;
import com.carros.loja.services.PromocaoService;

@RestController
@RequestMapping("/api/promocao")
public class PromocaoController {

    @Autowired
    private PromocaoService service;

    @GetMapping
    public ResponseEntity<List<Promocao>> get(@RequestParam(required = false) Long id,
            @RequestParam(required = false) Integer idVeiculo) {
        return ResponseEntity.ok().body(service.get(id, idVeiculo));
    }

    @GetMapping("/descricao")
    public ResponseEntity<List<Map<String, Object>>> getDescricao(@RequestParam Integer id) {
        return ResponseEntity.ok().body(service.getDescricao(id));
    }

    @PutMapping
    public ResponseEntity<Promocao> put(@RequestBody Promocao promocao) {
        return ResponseEntity.ok().body(service.store(promocao));
    }

    @DeleteMapping
    public ResponseEntity<Object> delete(@RequestParam long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
