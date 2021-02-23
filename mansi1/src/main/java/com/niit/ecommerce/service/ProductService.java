package com.niit.ecommerce.service;

import java.util.List;

import com.niit.ecommerce.model.Product;

public interface ProductService {
	public void add(Product product);
	public void update(Product product);
	public void delete(int id);
	public Product getProductById(int id);
	public List findAll();
}
