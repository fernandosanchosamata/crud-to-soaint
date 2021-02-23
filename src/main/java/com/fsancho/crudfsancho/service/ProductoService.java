package com.fsancho.crudfsancho.service;

import java.util.List;
import java.util.Optional;

import com.fsancho.crudfsancho.domain.Producto;

public interface ProductoService {

    Optional<Producto> getById(Long id);

    List<Producto> getAll();

    Producto save(Producto producto);

    void update(Producto producto);

}
