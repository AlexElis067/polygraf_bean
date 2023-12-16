package com.shop.polygraf.services;

import com.shop.polygraf.entities.AmountEntity;
import com.shop.polygraf.entities.ColorEntity;
import com.shop.polygraf.repositories.AmountRepository;
import com.shop.polygraf.repositories.ColorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColorService {
    @Autowired
    private ColorRepository cRepo;
    public void saveColor(ColorEntity c){
        cRepo.save(c);

    }

    public List<ColorEntity> getAllColor(){
        return cRepo.findAll();
    }

    public  ColorEntity getColorById(int id){
        return  cRepo.findById(id).get();

    }

    public void deleteColorById(int id){
        cRepo.deleteById(id);
    }

}
