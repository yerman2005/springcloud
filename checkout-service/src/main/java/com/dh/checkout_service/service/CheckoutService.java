package com.dh.checkout_service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dh.checkout_service.model.Checkout;
import com.dh.checkout_service.model.Product;

@Service
public class CheckoutService implements ICheckoutService {

	private IProductService productService;

	public CheckoutService(IProductService productService) {
		super();
		this.productService = productService;
	}

	@Override
	public Checkout buildCheckout(List<String> productIds) {
		Double total = 0.0;
		for (String id : productIds) {
			Product product = productService.getProduct(id);
			System.out.println("Anwser from "+product.getInstance());
			total += product.getAmount();
		}
		Checkout checkout = new Checkout("234", "www.dh.com/checkout?xxx", total, null);
		return checkout;
	}

}
