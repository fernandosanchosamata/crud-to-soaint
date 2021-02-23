package com.fsancho.crudfsancho.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fsancho.crudfsancho.domain.Producto;
import com.fsancho.crudfsancho.repository.ProductoRepository;
import com.fsancho.crudfsancho.service.ProductoService;

/**
 * Esta clase es el servicio de productos, obtiene tipo repository desde core
 * 
 * @author: Fernando Alfredo Sancho Samata
 * @version: 21/04/2020
 */
@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    ProductoRepository productoRepository;

    /**
     * Guardar
     */
    @Transactional
    @Override
    public Producto save(Producto producto) {
        return productoRepository.save(producto);
    }

    /**
     * Listar
     */
    @Override
    public List<Producto> getAll() {
        return (List<Producto>) productoRepository.findAll();
    }

    /**
     * Detalle de un producto
     */
    @Override
    public Optional<Producto> getById(Long id) {
        return productoRepository.findById(id);
    }

    /**
     * Actualizar
     */
    @Transactional
    @Override
    public void update(Producto producto) {
        productoRepository.save(producto);
    }

}
