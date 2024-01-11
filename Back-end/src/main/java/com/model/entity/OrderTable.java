package com.model.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
public class OrderTable {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_number")
    private Integer orderNumber;

    @Column(name = "order_date")
    private LocalDate orderDate;
    
    @Column(name = "total_amount")
    private BigDecimal totalAmount;

    @OneToMany(mappedBy = "orderTable", cascade = CascadeType.ALL)
    private List<OrderLineItem> orderLineItems;

}