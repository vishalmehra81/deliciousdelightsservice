package com.codeclan.example.deliciousdelightsservice.models;

public class Combo {

    private Long id;
    private ComboType type;

    public Combo(ComboType comboType) {
        this.type = comboType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ComboType getType() {
        return type;
    }

    public void setType(ComboType type) {
        this.type = type;
    }
}
