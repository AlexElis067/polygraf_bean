package com.shop.polygraf.repositories;

import com.shop.polygraf.entities.ColorEntity;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColorRepository extends JpaRepository<ColorEntity, Integer> {
}
