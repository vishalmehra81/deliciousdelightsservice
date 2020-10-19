package com.codeclan.example.deliciousdelightsservice.models;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String item;
    private int price;

    public Dish(String item, int price) {
        this.item = item;
        this.price = price;
    }

    public Dish() {
    }

    public Long getId() {
        return id;
    }

    public String getItem() {
        return item;
    }

    public int getPrice() {
        return price;
    }
}
