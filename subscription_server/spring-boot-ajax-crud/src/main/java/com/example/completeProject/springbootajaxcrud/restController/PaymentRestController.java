package com.example.completeProject.springbootajaxcrud.restController;

import com.example.completeProject.springbootajaxcrud.entity.Payment;
import com.example.completeProject.springbootajaxcrud.entity.Payment;
import com.example.completeProject.springbootajaxcrud.entity.User;
import com.example.completeProject.springbootajaxcrud.repository.PaymentRepository;
import com.example.completeProject.springbootajaxcrud.repository.UserRepository;
import com.example.completeProject.springbootajaxcrud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="*")
public class PaymentRestController {
    @Autowired
    PaymentService paymentService;

    @GetMapping("/payment")
    public List<Payment> getPaymentList(){
        return paymentService.getPaymentList();
    }

    @GetMapping("/payment/{paymentId}")
    public Payment getPayment(@PathVariable String paymentId)
    {
        return paymentService.getPaymentById(Integer.parseInt(paymentId));
    }

    @PostMapping(path = "/payment",consumes = "application/json")
    public Payment addPayment(@RequestBody Payment payment){
        paymentService.saveOrUpdatePayment(payment);
        return payment;
    }

    @PutMapping(path = "/payment", consumes = "application/json")
    public Payment updatePayment(@RequestBody Payment payment){
        paymentService.saveOrUpdatePayment(payment);
        return payment;
    }

    @DeleteMapping(value = "/payment/{paymentId}")
    public ResponseEntity<HttpStatus> deletePayment(@PathVariable("paymentId") String paymentId)
    {
        try{
            paymentService.deletePayment(Integer.parseInt(paymentId));
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
