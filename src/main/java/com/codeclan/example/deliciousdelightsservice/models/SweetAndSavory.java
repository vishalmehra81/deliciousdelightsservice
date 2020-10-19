package com.codeclan.example.deliciousdelightsservice.models;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sweetAndSavorys")
@Embeddable
public class SweetAndSavory extends Dish {

    @Id
    private Long id;

    public SweetAndSavory(String item, int price) {
        super(item, price);

    }

    public SweetAndSavory() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
