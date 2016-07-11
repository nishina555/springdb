package com.myproject;

import com.myproject.domain.Customer;
import com.myproject.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;


@EnableAutoConfiguration
@ComponentScan
public class SpringDbApplication implements CommandLineRunner {
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public void run(String... strings) throws Exception{
        Customer created = customerRepository.save(new Customer(null,"toshiharu", "nishina"));
        System.out.println(created + " is created");
/*        customerRepository.findAll()
                .forEach(System.out::println);*/
        customerRepository.findAllOrderByName()
                .forEach(System.out::println);
    }

    @RequestMapping("/")
    String home(){
        return "Hello World";
    }



    public static void main(String[] args) {
        SpringApplication.run(SpringDbApplication.class, args);
    }
}
