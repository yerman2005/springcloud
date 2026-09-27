package com.dh.products_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dh.products_service.model.Product;

@RestController
@RequestMapping(value="/products")
public class ProductRestController {
	
	@GetMapping
	public Product getProduct(@RequestParam String id) {
		return new Product(id, "Producto 1", 2000.0, "Instance 2");
	}

}
