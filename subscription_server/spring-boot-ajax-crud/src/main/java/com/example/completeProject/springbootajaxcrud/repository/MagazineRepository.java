package com.example.completeProject.springbootajaxcrud.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.completeProject.springbootajaxcrud.entity.Magazine;

public interface MagazineRepository extends JpaRepository<Magazine, Integer> {

}
