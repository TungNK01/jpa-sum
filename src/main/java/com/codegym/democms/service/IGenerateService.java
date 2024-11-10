package com.codegym.democms.service;

import com.codegym.democms.model.Customer;

import java.util.List;

public interface IGenerateService<T> {
    List<T> findAll();

    void save(T t);

    T findById(Long id);

    void remove(Long id);
}