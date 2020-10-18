package com.codeclan.example.deliciousdelightsservice.models;

public class Admin {

    private Long id;
    private String name;

    public Admin(String name) {
        this.name = name;
    }

    public Admin() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
