package com.codeclan.example.deliciousdelightsservice.models;

public enum ComboType {

    MINIMEAL(3),
    LITEBITE(5),
    BIGBITE(7),
    JUMBOFEAST(10);

    private final int price;
    ComboType(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
