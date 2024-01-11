package com.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Customer {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Integer customerId;

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private int age;
    private String email;
    private String phone;
    private String locale;
    
//    @ManyToOne
//	@JoinColumn(name = "addressId")
//	@JsonIgnore
//    private Address billAddress;

    @ManyToOne
	@JoinColumn(name = "address_id")
	@JsonIgnore
    private Address shipAddress;

}