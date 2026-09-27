package com.dh.checkout_service.service;

import java.util.List;

import com.dh.checkout_service.model.Checkout;

public interface ICheckoutService {

	public Checkout buildCheckout(List<String> productIds);
}
