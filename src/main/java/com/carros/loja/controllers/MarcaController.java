package com.carros.loja.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carros.loja.models.Marca;
import com.carros.loja.services.MarcaService;

@RestController
@RequestMapping("/api/marca")
public class MarcaController extends BaseController<Marca, MarcaService> {

}
