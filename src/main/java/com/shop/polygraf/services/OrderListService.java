package com.shop.polygraf.services;

import com.shop.polygraf.entities.OrderListEntity;
import com.shop.polygraf.repositories.OrderListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderListService {

    @Autowired
    private OrderListRepository orderListRepository;

    public void saveMyOrders(OrderListEntity o){
        orderListRepository.save(o);
    }

    public List<OrderListEntity> getAllMyOrders() {
        return  orderListRepository.findAll();
    }

    public void deleteOrderById(int id){
        orderListRepository.deleteById(id);

    }

}
