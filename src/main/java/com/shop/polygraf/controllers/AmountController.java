package com.shop.polygraf.controllers;


import com.shop.polygraf.entities.AmountEntity;
import com.shop.polygraf.services.AmountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AmountController {

    @Autowired
    private AmountService amountService;


    @GetMapping("/amount_register")
    public  String amountRegister(){
        return "amountRegister";
    }

    @PostMapping("/save_amount")
    public String addAmount(@ModelAttribute AmountEntity am){
        amountService.saveAmount(am);
        return "redirect:/order_form";
    }


}
