package com.example.completeProject.springbootajaxcrud.repository;

import com.example.completeProject.springbootajaxcrud.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,Integer> {
}
