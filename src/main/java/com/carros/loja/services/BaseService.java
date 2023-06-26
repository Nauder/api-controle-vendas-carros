package com.carros.loja.services;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import lombok.Getter;

@Getter
public abstract class BaseService<T extends Object, R extends JpaRepository<T, Long>> {

    @Autowired
    private R repository;

    public List<T> get(Long id) {

        if (id == null) {
            return this.repository.findAll();
        }

        final List<T> list = new LinkedList<>();
        this.repository.findById(id).ifPresent(list::add);
        return list;
    }

    public void delete(long id) {
        this.repository.deleteById(id);
    }

    public T store(T type) {
        return this.repository.save(type);
    }
}
