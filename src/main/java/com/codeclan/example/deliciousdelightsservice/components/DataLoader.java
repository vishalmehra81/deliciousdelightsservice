package com.codeclan.example.deliciousdelightsservice.components;

import com.codeclan.example.deliciousdelightsservice.models.*;
import com.codeclan.example.deliciousdelightsservice.repositories.CustomerRepository;
import com.codeclan.example.deliciousdelightsservice.repositories.MenuRepository;
import com.codeclan.example.deliciousdelightsservice.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepository;
    
    @Autowired
    OrderRepository orderRepository;
    
    @Autowired
    MenuRepository menuRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        Customer customer1 = new Customer("John", "Lewis","john.lewis@gmail.com","9878675609","Dennistown" );
        customerRepository.save(customer1);

        Customer customer2 = new Customer("Smith", "Lewis","smith.lewis@gmail.com","9987776661","New Gorbals" );
        customerRepository.save(customer2);

        Customer customer3 = new Customer("Arnold", "Lewis","arnold.lewis@gmail.com","8765677876","Alexandra Park" );
        customerRepository.save(customer3);

        Customer customer4 = new Customer("Miklos", "Lewis","miklos.lewis@gmail.com","5678987657","Hanson Park" );
        customerRepository.save(customer4);

        Customer customer5 = new Customer("Alex", "Lewis","alex.lewis@gmail.com","7786785431","BroomPark Drive" );
        customerRepository.save(customer5);

        Order order1 = new Order("Customised","PannerKP", 3.50, 2, "20/10/2020", 4.00, 1234);
        orderRepository.save(order1);

        Order order2 = new Order("Customised","Baigan Masala", 1.50, 1, "21/10/2020", 2.00, 1234);
        orderRepository.save(order2);

        Order order3 = new Order("Customised","Chicken BM", 3.50, 2, "23/10/2020", 8.00, 1234);
        orderRepository.save(order3);

        Order order4 = new Order("Customised","PannerKurchan", 2.50, 5, "29/10/2020", 14.00, 1234);
        orderRepository.save(order4);

        Order order5 = new Order("Customised","PannerLD", 2.50, 6, "30/10/2020", 16.00, 1234);
        orderRepository.save(order5);
        
        List<Main> mainList1 = new ArrayList<>();
        mainList1.add(new Main("Paneer Bhurji",20));

        List<Accompaniment> accompanimentsList1 = new ArrayList<>();
        accompanimentsList1.add(new Accompaniment("Pickle",20));

        List<SweetAndSavory> sweetAndSavoriesList1 = new ArrayList<>();
        sweetAndSavoriesList1.add(new SweetAndSavory("Kheer",20));

        List<BreadAndRice> breadAndRicesList1 = new ArrayList<>();
        breadAndRicesList1.add(new BreadAndRice("Rice",20));


        Menu menu1 = new Menu(mainList1,accompanimentsList1,breadAndRicesList1,sweetAndSavoriesList1);
        menuRepository.save(menu1);

        List<Main> mainList2 = new ArrayList<>();
        mainList2.add(new Main("Chicken Rara",5));

        List<Accompaniment> accompanimentsList2 = new ArrayList<>();
        accompanimentsList2.add(new Accompaniment("Raita",2));

        List<SweetAndSavory> sweetAndSavoriesList2 = new ArrayList<>();
        sweetAndSavoriesList2.add(new SweetAndSavory("Rabri",8));

        List<BreadAndRice> breadAndRicesList2 = new ArrayList<>();
        breadAndRicesList2.add(new BreadAndRice("Naan",10));


        Menu menu2 = new Menu(mainList2,accompanimentsList2,breadAndRicesList2,sweetAndSavoriesList2);
        menuRepository.save(menu2);

    }
}
