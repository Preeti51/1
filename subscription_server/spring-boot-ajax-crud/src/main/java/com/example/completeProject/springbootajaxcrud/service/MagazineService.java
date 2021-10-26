package com.example.completeProject.springbootajaxcrud.service;


import com.example.completeProject.springbootajaxcrud.entity.Magazine;
import com.example.completeProject.springbootajaxcrud.repository.MagazineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MagazineService {
    @Autowired
    private MagazineRepository magazineRepository;

    public List<Magazine> getMagazineList() {
        return magazineRepository.findAll();
    }

    public Magazine getMagazineById(Integer id) {
        return magazineRepository.findById(id).get();
    }

    public void saveOrUpdateMagazine(Magazine magazine) {
        magazineRepository.save(magazine);
    }

    public void deleteMagazine(Integer id) {
        magazineRepository.deleteById(id);
    }
}
