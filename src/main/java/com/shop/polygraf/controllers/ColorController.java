package com.shop.polygraf.controllers;

import com.shop.polygraf.entities.AmountEntity;
import com.shop.polygraf.entities.ColorEntity;
import com.shop.polygraf.services.AmountService;
import com.shop.polygraf.services.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ColorController {
    @Autowired
    private ColorService colorService;


    @GetMapping("/color_register")
    public  String colorRegister(){
        return "colorRegister";
    }

    @PostMapping("/save_color")
    public String addColor(@ModelAttribute ColorEntity c){
        colorService.saveColor(c);
        return "redirect:/order_form";
    }


}
