package com.model.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Address {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Integer addressId;

    private String street;
    private String city;
    private String state;
    
    @Column(name = "postal_code")
    private String postalCode;
    
//    @OneToMany(mappedBy = "billAddress")
//    List<Customer> billCustomer = new ArrayList<>();
    
    @OneToMany(mappedBy = "shipAddress")
    List<Customer> shipCustomer = new ArrayList<>();

}