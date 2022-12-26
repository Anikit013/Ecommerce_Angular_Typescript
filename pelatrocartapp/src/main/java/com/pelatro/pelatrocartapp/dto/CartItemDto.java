package com.pelatro.pelatrocartapp.dto;

import java.util.List;

import com.pelatro.pelatrocartapp.entity.Cart;

public class CartItemDto {
	
	private List<Cart> cartItems;
    private double totalCost;
	public List<Cart> getCartItems() {
		return cartItems;
	}
	public void setCartItems(List<Cart> cartItems) {
		this.cartItems = cartItems;
	}
	public double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	public CartItemDto(List<Cart> cartItems, double totalCost) {
		super();
		this.cartItems = cartItems;
		this.totalCost = totalCost;
	}
	public CartItemDto() {
		super();
		// TODO Auto-generated constructor stub
	}
}
