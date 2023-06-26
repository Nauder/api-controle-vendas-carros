package com.carros.loja.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.carros.loja.services.BaseService;

import lombok.Getter;

@Getter
public class BaseController<T, S extends BaseService<T, ?>> {

    @Autowired
    private S service;

    @GetMapping
    public ResponseEntity<List<T>> get(@RequestParam(required = false) Long id) {
        return ResponseEntity.ok().body(service.get(id));
    }

    @PutMapping
    public ResponseEntity<T> put(@RequestBody T type) {
        return ResponseEntity.ok().body(service.store(type));
    }

    @DeleteMapping
    public ResponseEntity<Object> delete(@RequestParam long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

}
