package com.adilgadirov.orderservice.repository;

import com.adilgadirov.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
