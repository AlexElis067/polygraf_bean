package com.shop.polygraf.controllers;

import com.shop.polygraf.entities.ColorEntity;
import com.shop.polygraf.entities.PaperEntity;
import com.shop.polygraf.services.ColorService;
import com.shop.polygraf.services.PaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PaperController {

    @Autowired
    private PaperService paperService;


    @GetMapping("/paper_register")
    public  String paperRegister(){
        return "paperRegister";
    }

    @PostMapping("/save_paper")
    public String addPaper(@ModelAttribute PaperEntity p){
        paperService.savePaper(p);
        return "redirect:/order_form";
    }
}
