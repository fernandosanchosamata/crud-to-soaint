package com.fsancho.crudfsancho.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fsancho.crudfsancho.domain.Producto;

@Repository
public interface ProductoRepository extends CrudRepository<Producto, Long>{

	 
}
