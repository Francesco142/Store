package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
