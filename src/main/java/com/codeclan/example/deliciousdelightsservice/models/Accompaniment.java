package com.codeclan.example.deliciousdelightsservice.models;

public class Accompaniment extends Dish {

    private Long id;

    public Accompaniment(String item, int price) {
        super(item, price);

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
