package com.tharunbalaji.springbootems.service;

import com.tharunbalaji.springbootems.model.Employee;
import com.tharunbalaji.springbootems.repository.EMSRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EMSService {

    List<Employee> getAllEmployees();

    void saveStudent(Employee employee);
}
