package com.codeclan.example.deliciousdelightsservice.controllers;

import com.codeclan.example.deliciousdelightsservice.models.Accompaniment;
import com.codeclan.example.deliciousdelightsservice.models.Main;
import com.codeclan.example.deliciousdelightsservice.models.Menu;
import com.codeclan.example.deliciousdelightsservice.repositories.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MenuController {

    @Autowired
    MenuRepository menuRepository;

    @GetMapping(value = "/menus")
    public ResponseEntity<List<Menu>> getAllMenu(){
        return new ResponseEntity<>(menuRepository.findAll(), HttpStatus.OK);
    }

}



