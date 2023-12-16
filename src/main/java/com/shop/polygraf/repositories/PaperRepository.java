package com.shop.polygraf.repositories;

import com.shop.polygraf.entities.PaperEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaperRepository extends JpaRepository<PaperEntity,Integer> {
}
