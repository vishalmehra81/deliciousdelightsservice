package com.codeclan.example.deliciousdelightsservice.controllers;

import com.codeclan.example.deliciousdelightsservice.models.Order;
import com.codeclan.example.deliciousdelightsservice.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    OrderRepository orderRepository;

    @GetMapping(value = "/orders")
    public ResponseEntity<List<Order>> getAllOrders(){
        return new ResponseEntity<>(orderRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/orders/{id}")
    public ResponseEntity getOrder(@PathVariable Long id){
        return new ResponseEntity<>(orderRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/orders")
    public ResponseEntity<Order> createOrder(@RequestBody Order order){
        orderRepository.save(order);
        return new ResponseEntity<>(order, HttpStatus.CREATED);
    }

    @PatchMapping(value = "/orders/{id}")
    public ResponseEntity<Order> updateOrder(@RequestBody Order order){
        orderRepository.save(order);
        return new ResponseEntity<>(order, HttpStatus.OK);
    }

    @DeleteMapping(value = "/orders/{id}")
    public ResponseEntity<Order> deleteOrder(@PathVariable Long id) {
        Order found = orderRepository.getOne(id);
        orderRepository.delete(found);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

}
