package com.codeclan.example.deliciousdelightsservice.models;

public abstract class Payment implements IPay {
    protected double totalAmount;
    protected String bookingRef;
    protected String date;

    public Payment(int totalAmount, String bookingRef, String date) {
        this.totalAmount = totalAmount;
        this.bookingRef = bookingRef;
        this.date = date;
    }

    public Payment() {
    }

    public String getBookingRef() {
        return bookingRef;
    }

    public String getDate() {
        return date;
    }
}



