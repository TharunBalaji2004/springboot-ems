package com.tharunbalaji.springbootems.repository;

import com.tharunbalaji.springbootems.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EMSRepository extends JpaRepository<Employee, Long> {

}
