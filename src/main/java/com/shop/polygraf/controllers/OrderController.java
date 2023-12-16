package com.shop.polygraf.controllers;

import com.shop.polygraf.entities.OrderListEntity;
import com.shop.polygraf.services.OrderListService;
import com.shop.polygraf.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class OrderController {

   @Autowired
    private OrderService orderService;

   @Autowired
   private OrderListService orderListService;


    @GetMapping("/")
    public String home() {return "home";}


    @GetMapping("/order_form")
    public String getOrder() {
        return "orderForm";
    }



    @GetMapping("/my_orders")
    public String getMyOrders(Model model){
        List<OrderListEntity> list= orderListService.getAllMyOrders();
        model.addAttribute("order",list);
        return "myOrders";
    }





}
