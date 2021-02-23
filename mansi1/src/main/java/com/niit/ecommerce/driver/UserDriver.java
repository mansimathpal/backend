package com.niit.ecommerce.driver;

//import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.ecommerce.dao.UserDAO;
import com.niit.ecommerce.model.User;

public class UserDriver {
	public static void main(String[]args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.ecommerce");
		context.refresh();
		//1. Insert the user
		User user = new User("user", "user123", "user789@outlook.com", 1234567890, "Southex");
		
		UserDAO userDAO = (UserDAO) context.getBean("userDAO");
		
	   // dao.addUser(user);
		
		userDAO.saveUser(user);
		
		//2. update the product
		// 2.1 get the product object by using getProductById()
		// 2.2 update the object by using set methods and use update() on the object
		
	//	User use = dao.getUserById(2);
	//	use.setAddress("France");
	//	dao.updateUser(use);
		//System.out.println(use);
		
		// 3. delete the product
		// 3.1 get the product object by using getProductById()
		// 3.2 delete the object by using set methods and use delete () on the object
		
	//	User useDelete = dao.getUserById(2);
	//	dao.deleteUser(useDelete);
		
		// 4. get all the products
		
		//List<User> user = dao.findAll();
		//for(User u : user) {
			//System.out.println(u);
		//}
	}
}
