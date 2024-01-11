package com.model.entity;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Product {
	
    @Id
    private String code;

    private String name;
    private String variants;
    private String description;
    private BigDecimal price;
    private String retailer;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<OrderLineItem> orderLineItems;

    
}