package com.codeclan.example.deliciousdelightsservice.models;

public class BreadAndRice {

    private Long id;
    private String item;
    private int price;

    public BreadAndRice(String item, int price) {
        this.item = item;
        this.price = price;
    }

    public BreadAndRice() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
