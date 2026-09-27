package com.dh.checkout_service.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dh.checkout_service.model.Checkout;
import com.dh.checkout_service.service.ICheckoutService;

@RestController
public class CheckoutRestController {

	private ICheckoutService checkoutService;

	public CheckoutRestController(ICheckoutService checkoutService) {
		super();
		this.checkoutService = checkoutService;
	}

	@GetMapping("/checkout")
	public Checkout products(@RequestParam List<String> productIds, @RequestHeader("X-Request-from") String requestHeader) {
		System.out.println("Enviado desde: " + requestHeader);
		if (!requestHeader.equals("gateway")) {
			return null;
		}
		return checkoutService.buildCheckout(productIds);
	}
}
