package com.niit.ecommerce.dao;

import com.niit.ecommerce.model.Cart;

public interface CartDAO {
	
	public void addTocart(Cart cart);
	public void deleteFromCart(int cartId);
	public Cart getFromCart(int cartId);
}
