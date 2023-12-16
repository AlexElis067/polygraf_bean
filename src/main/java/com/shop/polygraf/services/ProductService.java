package com.shop.polygraf.services;

import com.shop.polygraf.entities.AmountEntity;
import com.shop.polygraf.entities.ProductEntity;
import com.shop.polygraf.repositories.AmountRepository;
import com.shop.polygraf.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository pRepo;
    public void saveProduct(ProductEntity p){
        pRepo.save(p);

    }

    public List<ProductEntity> getAllProduct(){
        return pRepo.findAll();
    }

    public  ProductEntity getProductById(int id){
        return  pRepo.findById(id).get();

    }

    public void deleteProductById(int id){
        pRepo.deleteById(id);
    }
}
