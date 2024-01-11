package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.entity.Product;

public interface ProductRepo extends JpaRepository<Product, String> {

}
