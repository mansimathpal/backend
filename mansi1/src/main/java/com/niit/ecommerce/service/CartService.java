package com.niit.ecommerce.service;

import com.niit.ecommerce.model.Cart;

public interface CartService {
	public  void addTocart(Cart cart);
	public void deleteFromCart(int cartId);
	public Cart getFromCart(int cartId);
}
