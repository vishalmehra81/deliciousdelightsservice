package com.codeclan.example.deliciousdelightsservice.models;

import javax.persistence.*;

@Entity
@Table(name="accompaniments")
@Embeddable
public class Accompaniment extends Dish {

    @Id
    private Long id;

    public Accompaniment(String item, int price) {
        super(item, price);

    }

    public Accompaniment() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
