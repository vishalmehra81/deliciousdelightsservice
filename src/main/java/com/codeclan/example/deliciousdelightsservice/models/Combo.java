package com.codeclan.example.deliciousdelightsservice.models;

public class Combo extends Menu {

    private Long id;
    private ComboType type;

    public Combo(ComboType comboType, int noOfItems) {
        super(comboType.getItem());
        this.type = comboType;
    }

    public Combo(int noOfItems) {
        super(noOfItems);
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
