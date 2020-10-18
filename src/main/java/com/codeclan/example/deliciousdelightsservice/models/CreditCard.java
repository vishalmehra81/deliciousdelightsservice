package com.codeclan.example.deliciousdelightsservice.models;

public class CreditCard extends Payment {

    private String cardNumber;
    private String expiryDate;
    private int securityNumber;

    public CreditCard(String cardNumber, String expiryDate, int securityNumber, int totalAmount, String bookingRef, String date) {
        super(totalAmount,bookingRef,date);
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.securityNumber = securityNumber;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public String getExpiryDate() {
        return this.expiryDate;
    }

    public int getSecurityNumber() {
        return this.securityNumber;
    }

    public double pay() {
        return totalAmount;
    }

}

