package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.entity.OrderTable;

public interface OrderTableRepo extends JpaRepository<OrderTable, Integer> {

}
