package com.example.cardapio.domain;

import jakarta.persistence.*;

import java.util.UUID;

@Entity(name = "foods")
@Table(name = "foods")
public class FoodDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;
    private String title;
    private String image;
    private Double price;

    public FoodDomain() {
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
