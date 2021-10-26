package com.example.completeProject.springbootajaxcrud.repository;

import com.example.completeProject.springbootajaxcrud.entity.Price;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRepository extends JpaRepository<Price,Integer> {
}
