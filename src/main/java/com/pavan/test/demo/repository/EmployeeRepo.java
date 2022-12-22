package com.pavan.test.demo.repository;

import com.pavan.test.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    List<Employee> findByName(String name);
}
