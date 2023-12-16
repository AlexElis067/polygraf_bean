package com.shop.polygraf.controllers;

import com.shop.polygraf.entities.PaperEntity;
import com.shop.polygraf.entities.SizeEntity;
import com.shop.polygraf.services.PaperService;
import com.shop.polygraf.services.SizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SizeController {
    @Autowired
    private SizeService sizeService;


    @GetMapping("/size_register")
    public  String sizeRegister(){
        return "sizeRegister";
    }

    @PostMapping("/save_size")
    public String addSize(@ModelAttribute SizeEntity s){
        sizeService.saveSize(s);
        return "redirect:/order_form";
    }
}
