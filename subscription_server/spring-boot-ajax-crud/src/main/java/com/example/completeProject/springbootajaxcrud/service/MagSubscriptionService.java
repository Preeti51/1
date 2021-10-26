package com.example.completeProject.springbootajaxcrud.service;


import com.example.completeProject.springbootajaxcrud.entity.Cart;
import com.example.completeProject.springbootajaxcrud.entity.MagSubscription;
import com.example.completeProject.springbootajaxcrud.repository.MagSubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MagSubscriptionService {
    @Autowired
    private MagSubscriptionRepository magSubscriptionRepository;

    public List<MagSubscription> getMagSubscriptionList() {
        return magSubscriptionRepository.findAll();
    }

    public MagSubscription getMagSubscriptionById(Integer id) {
        return magSubscriptionRepository.findById(id).get();
    }

    public void saveOrUpdateMagSubscription(MagSubscription magSubscription) {
        magSubscriptionRepository.save(magSubscription);
    }

    public void deleteMagSubscription(Integer id) {
        magSubscriptionRepository.deleteById(id);
    }
}
