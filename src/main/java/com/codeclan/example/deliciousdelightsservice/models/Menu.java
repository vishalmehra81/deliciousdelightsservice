package com.codeclan.example.deliciousdelightsservice.models;

import java.util.ArrayList;

public abstract class Menu {
    private int noOfItems;
    private ArrayList<Main>mains;
    private ArrayList<Accompaniment>accompaniments;
    private ArrayList<BreadAndRice>breadAndRices;
    private ArrayList<SweetAndSavory>sweetAndSavories;

    public Menu(int noOfItems) {
        this.noOfItems = noOfItems;
        this.mains = new ArrayList<Main>();
        this.accompaniments = new ArrayList<Accompaniment>();
        this.breadAndRices = new ArrayList<BreadAndRice>();
        this.sweetAndSavories = new ArrayList<SweetAndSavory>();
    }

    public int getNoOfItems() {
        return noOfItems;
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


}
