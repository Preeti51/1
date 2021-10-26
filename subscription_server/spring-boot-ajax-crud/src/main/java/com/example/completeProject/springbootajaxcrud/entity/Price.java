package com.example.completeProject.springbootajaxcrud.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="price")
public class Price {
    @Id
    @Column(name="mag_id")
    private Integer magId;

    @Column(name="price")
    private Integer price;

    @Column(name="months")
    private Integer months;

    public Price() {

    }


    public Price(Integer magId, Integer price, Integer months) {
        this.magId = magId;
        this.price = price;
        this.months = months;
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

    public Integer getMonths() {
        return months;
    }

    public void setMonths(Integer months) {
        this.months = months;
    }
}
