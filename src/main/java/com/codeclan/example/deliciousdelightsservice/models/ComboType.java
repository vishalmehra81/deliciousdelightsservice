package com.codeclan.example.deliciousdelightsservice.models;

public enum ComboType {

    MINIMEAL(5),
    LITEBITE(6),
    BIGBITE(7),
    JUMBOFEAST(10);

    private final int item;
    ComboType(int item) {
        this.item = item;
    }

    public int getItem() {
        return item;
    }
}
