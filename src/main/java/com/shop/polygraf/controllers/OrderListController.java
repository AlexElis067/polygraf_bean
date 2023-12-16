package com.shop.polygraf.controllers;

import com.shop.polygraf.services.OrderListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderListController {

    @Autowired
    private OrderListService service;

    @RequestMapping("/deleteMyList/{id}")
    public  String deleteMyList(@PathVariable("id") int id){
        service.deleteOrderById(id);
        return  "/redirect:/my_orders";
    }

}
