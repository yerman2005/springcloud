package com.dh.checkout_service.repository;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dh.checkout_service.model.Product;

@FeignClient(name = "products-service")
public interface FeignProductRepository {

	@GetMapping("/products")
	Product getProductById(@RequestParam String id);
}
