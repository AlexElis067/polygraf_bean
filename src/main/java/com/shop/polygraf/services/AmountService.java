package com.shop.polygraf.services;

import com.shop.polygraf.entities.AmountEntity;
import com.shop.polygraf.repositories.AmountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AmountService {
    @Autowired
    private AmountRepository aRepo;
    public void saveAmount(AmountEntity a){
        aRepo.save(a);

    }

    public List<AmountEntity> getAllAmount(){
        return aRepo.findAll();
    }

    public  AmountEntity getAmountById(int id){
        return  aRepo.findById(id).get();

    }

    public void deleteAmountById(int id){
        aRepo.deleteById(id);
    }
}
