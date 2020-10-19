package com.codeclan.example.deliciousdelightsservice.controllers;

import com.codeclan.example.deliciousdelightsservice.models.Menu;
import com.codeclan.example.deliciousdelightsservice.repositories.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MenuController {

    @Autowired
    MenuRepository menuRepository;


    @GetMapping(value = "/menus")
    public ResponseEntity<List<Menu>> getAllMenus(){
        return new ResponseEntity<>(menuRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/menus/{id}")
    public ResponseEntity getMenu(@PathVariable Long id){
        return new ResponseEntity<>(menuRepository.findById(id), HttpStatus.OK);
    }


}
