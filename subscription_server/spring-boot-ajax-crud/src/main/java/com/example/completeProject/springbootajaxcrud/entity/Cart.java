package com.example.completeProject.springbootajaxcrud.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class Cart {
    @Id
    @Column(name="cart_id")
    private Integer id;

    @Column(name="user_id")
    private Integer userId;

    @Column(name="mag_id")
    private Integer magId;

    @Column(name="price")
    private Integer price;

    public Cart() {
    }

    public Cart(Integer id, Integer userId, Integer magId, Integer price) {
        this.id = id;
        this.userId = userId;
        this.magId = magId;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getMagId() {
        return magId;
    }

    public void setMagId(Integer magId) {
        this.magId = magId;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
