package com.model.entity;

import java.math.BigDecimal;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;

@Entity
public class OrderLineItem {
	
    @EmbeddedId
    private OrderLineItemId id;
    
    @ManyToOne
    @MapsId("orderNumber")
    @JoinColumn(name = "order_number")
    private OrderTable orderTable;

    @ManyToOne
    @MapsId("code")
    @JoinColumn(name = "product_code")
    private Product product;

    private BigDecimal amount;
    
    private int quantity;

}