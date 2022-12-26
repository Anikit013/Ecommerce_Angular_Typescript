package com.pelatro.pelatrocartapp.entity;

public class Order {

	private int id;
	

	private int price;

	private int quantity;

	private Users user;

	private Products product;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public Products getProduct() {
		return product;
	}
	public void setProduct(Products product) {
		this.product = product;
	}
	public Order(int price, int quantity, Users user, Products product) {
		super();
		this.price = price;
		this.quantity = quantity;
		this.user = user;
		this.product = product;
	}
	public Order() {
		super();
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", price=" + price + ", quantity=" + quantity + ", user=" + user + ", product="
				+ product + "]";
	}
	
}
