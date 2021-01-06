package com.devsuperior.dsdeliver.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
