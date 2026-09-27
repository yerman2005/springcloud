package com.dh.checkout_service.service;

import org.springframework.stereotype.Service;

import com.dh.checkout_service.model.Product;
import com.dh.checkout_service.repository.FeignProductRepository;

@Service
public class ProductService implements IProductService {

	private FeignProductRepository feignProductRepo;

	public ProductService(FeignProductRepository feignProductRepo) {
		this.feignProductRepo = feignProductRepo;
	}

	@Override
	public Product getProduct(String id) {
		return feignProductRepo.getProductById(id);
	}
}
