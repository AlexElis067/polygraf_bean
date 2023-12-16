package com.shop.polygraf.services;

import com.shop.polygraf.entities.AmountEntity;
import com.shop.polygraf.entities.SizeEntity;
import com.shop.polygraf.repositories.AmountRepository;
import com.shop.polygraf.repositories.SizeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SizeService {
    @Autowired
    private SizeRepository  sRepo;
    public void saveSize(SizeEntity s){
        sRepo.save(s);

    }

    public List<SizeEntity> getAllSize(){
        return sRepo.findAll();
    }

    public  SizeEntity getSizeById(int id){
        return  sRepo.findById(id).get();

    }

    public void deleteSizeById(int id){
        sRepo.deleteById(id);
    }
}
