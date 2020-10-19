package com.codeclan.example.deliciousdelightsservice.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "menus")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ElementCollection
    @Embedded
    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name="main_id")
    private List<Main> mains;

    @ElementCollection
    @Embedded
    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name="accompaniment_id")
    private List<Accompaniment> accompaniments;

    @ElementCollection
    @Embedded
    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name="breadAndRice_id")
    private List<BreadAndRice> breadAndRices;

    @ElementCollection
    @Embedded
    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name="sweetAndSavory_id")
    private List<SweetAndSavory> sweetAndSavories;

    public Menu(List<Main> mains, List<Accompaniment> accompaniments, List<BreadAndRice> breadAndRices, List<SweetAndSavory> sweetAndSavories) {
        this.mains = mains;
        this.accompaniments = accompaniments;
        this.breadAndRices = breadAndRices;
        this.sweetAndSavories = sweetAndSavories;
    }

    public Menu() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int mainListSize(){
        return this.mains.size();
    }

    public int accompanimentListSize(){
        return this.accompaniments.size();
    }

    public int breadAndRiceListSize(){
        return this.breadAndRices.size();
    }

    public int sweetAndSavoryListSize(){
        return this.sweetAndSavories.size();
    }

    public List<Main> getMains() {
        return mains;
    }

    public void setMains(List<Main> mains) {
        this.mains = mains;
    }

    public List<Accompaniment> getAccompaniments() {
        return accompaniments;
    }

    public void setAccompaniments(List<Accompaniment> accompaniments) {
        this.accompaniments = accompaniments;
    }

    public List<BreadAndRice> getBreadAndRices() {
        return breadAndRices;
    }

    public void setBreadAndRices(List<BreadAndRice> breadAndRices) {
        this.breadAndRices = breadAndRices;
    }

    public List<SweetAndSavory> getSweetAndSavories() {
        return sweetAndSavories;
    }

    public void setSweetAndSavories(List<SweetAndSavory> sweetAndSavories) {
        this.sweetAndSavories = sweetAndSavories;
    }

}
