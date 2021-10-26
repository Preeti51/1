package com.example.completeProject.springbootajaxcrud.service;


import com.example.completeProject.springbootajaxcrud.entity.Cart;
import com.example.completeProject.springbootajaxcrud.entity.User;
import com.example.completeProject.springbootajaxcrud.repository.CartRepository;
import com.example.completeProject.springbootajaxcrud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {
    @Autowired
    private CartRepository cartRepository;

    public List<Cart> getCartList() {
        return cartRepository.findAll();
    }

    public Cart getCartById(Integer id) {
        return cartRepository.findById(id).get();
    }

    public void saveOrUpdateCart(Cart cart) {
        cartRepository.save(cart);
    }

    public void deleteCart(Integer id) {
        cartRepository.deleteById(id);
    }

}
