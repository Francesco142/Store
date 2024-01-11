package com.model.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class OrderLineItemId implements Serializable {
	
	
	private static final long serialVersionUID = 1524649869615047786L;

	@Column(name = "order_number")
	private Integer orderNumber;

	private String code;

  
}