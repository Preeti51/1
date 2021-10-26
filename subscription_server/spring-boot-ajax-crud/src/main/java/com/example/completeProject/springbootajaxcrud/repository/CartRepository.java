package com.example.completeProject.springbootajaxcrud.repository;

import com.example.completeProject.springbootajaxcrud.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart,Integer> {
}
