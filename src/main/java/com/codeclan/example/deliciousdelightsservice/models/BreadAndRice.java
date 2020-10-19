package com.codeclan.example.deliciousdelightsservice.models;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="breadAndRices")
@Embeddable
public class BreadAndRice extends Dish {

    @Id
    private Long id;

    public BreadAndRice(String item, int price) {
        super(item, price);

    }

    public BreadAndRice() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
