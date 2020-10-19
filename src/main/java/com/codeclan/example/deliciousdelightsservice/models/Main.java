package com.codeclan.example.deliciousdelightsservice.models;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mains")
@Embeddable
public class Main extends Dish {

    @Id
    private Long id;
    public Main(String item, int price) {
        super(item, price);

    }

    public Main() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
