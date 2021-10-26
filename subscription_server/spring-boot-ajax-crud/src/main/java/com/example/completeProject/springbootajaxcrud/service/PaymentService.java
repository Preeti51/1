package com.example.completeProject.springbootajaxcrud.service;


import com.example.completeProject.springbootajaxcrud.entity.Payment;
import com.example.completeProject.springbootajaxcrud.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    public List<Payment> getPaymentList() {
        return paymentRepository.findAll();
    }

    public Payment getPaymentById(Integer id) {
        return paymentRepository.findById(id).get();
    }

    public void saveOrUpdatePayment(Payment payment) {
        paymentRepository.save(payment);
    }

    public void deletePayment(Integer id) {
        paymentRepository.deleteById(id);
    }
}
