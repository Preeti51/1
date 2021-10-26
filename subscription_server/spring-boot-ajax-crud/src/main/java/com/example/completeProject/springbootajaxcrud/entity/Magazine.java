package com.example.completeProject.springbootajaxcrud.entity;


import javax.persistence.*;

@Entity
@Table(name = "magazine")
public class Magazine {
    @Id
    @Column(name = "mag_id")

    private Integer id;

    //why this default constructor?

    public Magazine(){

    }
    public Magazine(Integer id, String name, String genre) {
        this.id = id;
        this.name = name;
        this.genre = genre;
    }

    @Column(name = "mag_name")
    private String name;

    @Column(name = "genre")
    private String genre;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }






}