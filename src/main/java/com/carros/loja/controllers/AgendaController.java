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

import com.carros.loja.models.Agenda;
import com.carros.loja.services.AgendaService;

@RestController
@RequestMapping("/api/agenda")
public class AgendaController {

    @Autowired
    private AgendaService service;

    @GetMapping
    public ResponseEntity<List<Agenda>> get(@RequestParam(required = false) Long id,
            @RequestParam(required = false) Integer idVendedor,
            @RequestParam(required = false) Boolean limit) {
        return ResponseEntity.ok().body(service.get(id, idVendedor, limit));
    }

    @PutMapping
    public ResponseEntity<Agenda> put(@RequestBody Agenda venda) {
        return ResponseEntity.ok().body(service.store(venda));
    }

    @DeleteMapping
    public ResponseEntity<Object> delete(@RequestParam long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
