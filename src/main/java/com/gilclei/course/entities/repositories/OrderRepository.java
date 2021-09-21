package com.gilclei.course.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gilclei.course.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {	

}
