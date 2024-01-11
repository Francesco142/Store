package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.entity.Address;

public interface AddressRepo extends JpaRepository<Address, Integer> {
	
	

}
