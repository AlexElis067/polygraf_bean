package com.shop.polygraf.services;

import com.shop.polygraf.entities.OrderEntity;
import com.shop.polygraf.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;


    public void saveOrder(OrderEntity order){
        orderRepository.save(order);
    }

    public List<OrderEntity> getAllOrders(){
        return  orderRepository.findAll();
    }


    public OrderEntity getOrderById(int id){
        return orderRepository.findById(id).get();
    }

    public  void deleteOrderById(int id){
        orderRepository.deleteById(id);
    }

}
