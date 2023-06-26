package com.carros.loja.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.carros.loja.models.Veiculo;
import com.carros.loja.services.VeiculoService;

@RestController
@RequestMapping("/api/veiculo")
public class VeiculoController extends BaseController<Veiculo, VeiculoService> {

    @GetMapping("/descricao")
    public ResponseEntity<List<Map<String, Object>>> getDescricao(@RequestParam Integer id) {
        return ResponseEntity.ok().body(super.getService().getDescricao(id));
    }

}
