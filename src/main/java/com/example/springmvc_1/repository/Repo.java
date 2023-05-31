package com.example.springmvc_1.repository;

import java.util.List;

public interface Repo<T> {
    T fidById(String id);

    List<T> findAll();

    void save(T t);
}