package com.pavan.test.demo.controller;

import com.pavan.test.demo.dto.EmployeeDTO;
import com.pavan.test.demo.entity.Employee;
import com.pavan.test.demo.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/v1")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee")
    //@ResponseBody
    public Employee saveUser(@RequestBody EmployeeDTO employeeDTO) {
        log.info("Saving employee with name {}.", employeeDTO.getName());
        return employeeService.saveEmployee(employeeDTO);
    }
}
