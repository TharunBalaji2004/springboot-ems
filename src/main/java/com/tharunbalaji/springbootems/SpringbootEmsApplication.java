package com.tharunbalaji.springbootems;

import com.tharunbalaji.springbootems.model.Employee;
import com.tharunbalaji.springbootems.repository.EMSRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootEmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootEmsApplication.class, args);
    }

}
