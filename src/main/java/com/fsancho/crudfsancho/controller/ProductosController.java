package com.fsancho.crudfsancho.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.hibernate.service.spi.ServiceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fsancho.crudfsancho.domain.Producto;
import com.fsancho.crudfsancho.exception.ExceptionFactory;
import com.fsancho.crudfsancho.exception.enums.ExceptionType;
import com.fsancho.crudfsancho.service.ProductoService;

/**
 * Esta clase es el servicio de productos, obtiene tipo repository desde core
 * 
 * @author: Fernando Alfredo Sancho Samata
 */
@RestController
@RequestMapping("/api")
public class ProductosController {

	private static final Logger logger = LoggerFactory.getLogger(ProductosController.class);

	@Autowired
	ProductoService productoService;

	@GetMapping("/productos/{id}")
	public ResponseEntity<Producto> getById(@PathVariable long id) {
		Optional<Producto> producto = productoService.getById(id);
		if (!producto.isPresent()) {
			logger.info("There is not product");
			throw ExceptionFactory.create(ExceptionType.HTTP_NOT_FOUND);
		}
		return new ResponseEntity<Producto>(producto.get(), HttpStatus.OK);

	}

	@GetMapping("/productos")
	public ResponseEntity<List<Producto>> getAll() {
		List<Producto> productos = productoService.getAll();
		if (productos.isEmpty()) {
			throw ExceptionFactory.create(ExceptionType.HTTP_NOT_FOUND);
		}
		logger.info("There are products to list");
		return new ResponseEntity<List<Producto>>(productoService.getAll(), HttpStatus.OK);
	}

	@PostMapping("/productos")
	public ResponseEntity<Producto> insertProducto(@RequestBody Producto producto) throws ServiceException {
		Producto productoSaved = productoService.save(producto);
		logger.info("Product created");
		return new ResponseEntity<Producto>(productoSaved, HttpStatus.CREATED);
	}

	@PutMapping("/productos/{id}")
	public ResponseEntity<Producto> updateProducto(@PathVariable("id") long id, @RequestBody Producto producto) {
		Optional<Producto> OldProduct = productoService.getById(id);

		if (!OldProduct.isPresent()) {
			throw ExceptionFactory.create(ExceptionType.HTTP_NOT_FOUND);
		}
		Producto newProduct = OldProduct.get();
		newProduct.setNombre(producto.getNombre());
		newProduct.setExiste(producto.isExiste());
		newProduct.setFechaActualizacion(new Date());
		logger.info("Product updated");
		return new ResponseEntity<Producto>(productoService.save(newProduct), HttpStatus.OK);

	}
}
