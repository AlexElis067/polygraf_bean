package com.shop.polygraf.controllers;


import com.shop.polygraf.entities.PaperEntity;
import com.shop.polygraf.entities.ProductEntity;
import com.shop.polygraf.services.PaperService;
import com.shop.polygraf.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;


    @GetMapping("/product_register")
    public  String productRegister(){
        return "productRegister";
    }

    @PostMapping("/save_product")
    public String addProduct(@ModelAttribute ProductEntity p){
        productService.saveProduct(p);
        return "redirect:/order_form";
    }


}
