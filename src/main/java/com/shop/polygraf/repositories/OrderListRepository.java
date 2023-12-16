package com.shop.polygraf.repositories;

import com.shop.polygraf.entities.OrderListEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderListRepository extends JpaRepository<OrderListEntity, Integer> {
}
