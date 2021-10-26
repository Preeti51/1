package com.example.completeProject.springbootajaxcrud.service;

import com.example.completeProject.springbootajaxcrud.entity.MagazineStore;
import com.example.completeProject.springbootajaxcrud.entity.User;
import com.example.completeProject.springbootajaxcrud.repository.MagazineStoreRepository;
import com.example.completeProject.springbootajaxcrud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MagazineStoreService {
    @Autowired
    private MagazineStoreRepository magazineStoreRepository;

    public List<MagazineStore> getMagazineStoreList() {
        return magazineStoreRepository.findAll();
    }

    public MagazineStore getMagazineStoreById(Integer id) {
        return magazineStoreRepository.findById(id).get();
    }

    public void saveOrUpdateMagazineStore(MagazineStore magazineStore) {
        magazineStoreRepository.save(magazineStore);
    }

    public void deleteMagazineStore(Integer id) {
        magazineStoreRepository.deleteById(id);
    }
}
