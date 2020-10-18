package com.codeclan.example.deliciousdelightsservice.models;

public class Order {

    private Long id;
    private String meals;
    private String items;
    private double price;
    private int quantity;
    private String date;
    private String subTotal;
    private String orderId;

    public Order(String meals, String items, double price, int quantity, String date, String subTotal, String orderId) {
        this.meals = meals;
        this.items = items;
        this.price = price;
        this.quantity = quantity;
        this.date = date;
        this.subTotal = subTotal;
        this.orderId = orderId;
    }

    public Order() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMeals() {
        return meals;
    }

    public void setMeals(String meals) {
        this.meals = meals;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(String subTotal) {
        this.subTotal = subTotal;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
