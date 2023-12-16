package com.shop.polygraf.services;

import com.shop.polygraf.entities.PaperEntity;
import com.shop.polygraf.repositories.PaperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaperService {
    @Autowired
    private PaperRepository ppRepo;
    public void savePaper(PaperEntity z){
        ppRepo.save(z);

    }

    public List<PaperEntity> getAllPaper(){
        return ppRepo.findAll();
    }

    public PaperEntity getPaperById(int id){
        return  ppRepo.findById(id).get();

    }

    public void deletePaperById(int id){
        ppRepo.deleteById(id);
    }
}
