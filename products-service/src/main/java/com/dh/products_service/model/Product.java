package com.dh.products_service.model;

public class Product {
	private String id;
	private String description;
	private Double amount;
	private String instance;

	public Product(String id, String description, Double amount, String instance) {
		super();
		this.id = id;
		this.description = description;
		this.amount = amount;
		this.instance = instance;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getInstance() {
		return instance;
	}

	public void setInstance(String instance) {
		this.instance = instance;
	}
}
