package com.niit.ecommerce.driver;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.ecommerce.dao.ProductDAO;
import com.niit.ecommerce.model.Product;

public class ProductDriver {
	public static void main(String[]args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.ecommerce");
		context.refresh();
		//1. Insert the product
		Product product = new Product("Mobile", 32000, 1, "18/01/2018", "18/01/2023", "OnePlus 8T");
		
		ProductDAO dao = (ProductDAO) context.getBean("productDAO");
		
	    dao.addProduct(product);
		
		//2. update the product
		// 2.1 get the product object by using getProductById()
		// 2.2 update the object by using set methods and use update() on the object
		
     //	Product prod = dao.getProductById(1);
	//	prod.setExpiryDate("18/01/2025");
	//	dao.updateProduct(prod);
	//	System.out.println(prod);
	    
	  //  dao.deleteProduct(prod);
	}
}
