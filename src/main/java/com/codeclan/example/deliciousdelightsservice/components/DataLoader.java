package com.codeclan.example.deliciousdelightsservice.components;

import com.codeclan.example.deliciousdelightsservice.models.BreadAndRice;
import com.codeclan.example.deliciousdelightsservice.models.Menu;
import com.codeclan.example.deliciousdelightsservice.repositories.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    MenuRepository menuRepository;

    public DataLoader(){

    }
    public void run(ApplicationArguments args){

    }
}
