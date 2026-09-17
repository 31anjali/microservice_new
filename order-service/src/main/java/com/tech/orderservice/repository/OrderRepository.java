package com.tech.orderservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.tech.orderservice.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

    Order findByOrderNumber(String orderNumber);
    

}
