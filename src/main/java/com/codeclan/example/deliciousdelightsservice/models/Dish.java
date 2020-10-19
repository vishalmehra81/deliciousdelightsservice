package com.codeclan.example.deliciousdelightsservice.models;

public abstract class Dish {

    private Long id;
    private String item;
    private int price;

    public Dish(String item, int price) {
        this.item = item;
        this.price = price;
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
