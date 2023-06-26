package com.carros.loja.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carros.loja.models.Modelo;
import com.carros.loja.services.ModeloService;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/modelo")
public class ModeloController extends BaseController<Modelo, ModeloService> {

    @GetMapping("/descricao")
    public ResponseEntity<List<Map<String, Object>>> getDescricao(@RequestParam Integer id) {
        return ResponseEntity.ok().body(super.getService().getDescricao(id));
    }

}
