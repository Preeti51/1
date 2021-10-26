package com.example.completeProject.springbootajaxcrud.service;

import com.example.completeProject.springbootajaxcrud.entity.Price;
import com.example.completeProject.springbootajaxcrud.repository.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceService {
    @Autowired
    private PriceRepository priceRepository;

    public List<Price> getPriceList() {
        return priceRepository.findAll();
    }

    public Price getPriceById(Integer id) {
        return priceRepository.findById(id).get();
    }

    public void saveOrUpdatePrice(Price price) {
        priceRepository.save(price);
    }

    public void deletePrice(Integer id) {
        priceRepository.deleteById(id);
    }
}
