package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.entity.Product;
import com.repository.ProductRepo;

@RestController
@RequestMapping("/api/store")
public class StoreController {
	
	
	@Autowired
	ProductRepo prRepo;
	
	@PostMapping("/createProduct")
	public Product saveProduct(@RequestBody Product product) {
		
		System.out.println("Daje: " + product);
		
		return prRepo.save(product);
		
	}
		
	
	

}
