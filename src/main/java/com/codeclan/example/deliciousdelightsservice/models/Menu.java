package com.codeclan.example.deliciousdelightsservice.models;

import java.util.ArrayList;

public class Menu {
    private ArrayList<Main>mains;
    private ArrayList<Accompaniment>accompaniments;
    private ArrayList<BreadAndRice>breadAndRices;
    private ArrayList<SweetAndSavory>sweetAndSavories;
    private ArrayList<Combo>combos;


    public Menu() {
        this.mains = new ArrayList<Main>();
        this.accompaniments = new ArrayList<Accompaniment>();
        this.breadAndRices = new ArrayList<BreadAndRice>();
        this.sweetAndSavories = new ArrayList<SweetAndSavory>();
        this.combos = new ArrayList<Combo>();
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

    public int comboListSize(){
        return this.combos.size();
    }




}
