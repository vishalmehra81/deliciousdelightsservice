package com.codeclan.example.deliciousdelightsservice.components;

import com.codeclan.example.deliciousdelightsservice.models.BreadAndRice;
import com.codeclan.example.deliciousdelightsservice.models.Customer;
import com.codeclan.example.deliciousdelightsservice.models.Menu;
import com.codeclan.example.deliciousdelightsservice.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        Customer customer1 = new Customer("John", "Lewis","john.lewis@gmail.com","98786756","Glasgow" );
        customerRepository.save(customer1);


    }
}
