package com.example.completeProject.springbootajaxcrud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name="payment")
public class Payment {
    @Id
    @Column(name="cart_id")
    private Integer cartId;

    @Column(name="invoice_no")
    private Integer invoiceNo;

    @Column(name="date_of_payment")
    private LocalDate dateOfPayment;

    @Column(name="mode_of_payment")
    private String modeOfPayment;

    public Payment() {
    }

    public Payment(Integer cartId, Integer invoiceNo, LocalDate dateOfPayment, String modeOfPayment) {
        this.cartId = cartId;
        this.invoiceNo = invoiceNo;
        this.dateOfPayment = dateOfPayment;
        this.modeOfPayment = modeOfPayment;
    }

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Integer getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(Integer invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public LocalDate getDateOfPayment() {
        return dateOfPayment;
    }

    public void setDateOfPayment(LocalDate dateOfPayment) {
        this.dateOfPayment = dateOfPayment;
    }

    public String getModeOfPayment() {
        return modeOfPayment;
    }

    public void setModeOfPayment(String modeOfPayment) {
        this.modeOfPayment = modeOfPayment;
    }
}
