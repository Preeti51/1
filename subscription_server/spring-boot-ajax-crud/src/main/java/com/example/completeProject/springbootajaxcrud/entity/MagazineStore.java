package com.example.completeProject.springbootajaxcrud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="magazine_store")
public class MagazineStore {
    @Id
    @Column(name="mag_id")
    private Integer magId;

    @Column(name="edition")
    private Integer edition;

    @Column(name="stock")
    private Integer stock;

    public MagazineStore() {
    }

    public MagazineStore(Integer magId, Integer edition, Integer stock) {
        this.magId = magId;
        this.edition = edition;
        this.stock = stock;
    }

    public Integer getMagId() {
        return magId;
    }

    public void setMagId(Integer magId) {
        this.magId = magId;
    }

    public Integer getEdition() {
        return edition;
    }

    public void setEdition(Integer edition) {
        this.edition = edition;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
