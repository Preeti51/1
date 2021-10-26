package com.example.completeProject.springbootajaxcrud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "mag_subscription")
public class MagSubscription {
    @Id
    @Column(name="user_id")
    private Integer userId;

    @Column(name="mag_id")
    private Integer magId;

    @Column(name="start_date")
    private LocalDate startDate;

    @Column(name="end_date")
    private LocalDate endDate;

    public MagSubscription() {
    }

    public MagSubscription(Integer userId, Integer magId, LocalDate startDate, LocalDate endDate) {
        this.userId = userId;
        this.magId = magId;
        this.startDate = startDate;
        this.endDate = endDate;
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

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
