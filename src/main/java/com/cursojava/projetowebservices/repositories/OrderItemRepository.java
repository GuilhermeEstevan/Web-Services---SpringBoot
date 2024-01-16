package com.cursojava.projetowebservices.repositories;

import com.cursojava.projetowebservices.entities.OrderItem;
import com.cursojava.projetowebservices.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
