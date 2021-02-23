package com.niit.ecommerce.dao;

import java.util.List;

import com.niit.ecommerce.model.User;

public interface UserDAO {
	
	public boolean addUser(User user);
	public boolean deleteUser(User user);
	public boolean updateUser(User user);
	public User getUserById(int id);
	public boolean saveUser(User user);
	public List<User> findAll();
}
