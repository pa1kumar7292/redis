package com.pavan.test.demo.service;

import com.pavan.test.demo.dto.EmployeeDTO;
import com.pavan.test.demo.entity.Employee;
import com.pavan.test.demo.entity.User;
import com.pavan.test.demo.repository.EmployeeRepo;
import com.pavan.test.demo.utils.ObjectMapperUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private ObjectMapperUtils objectMapperUtils;

    public Employee saveEmployee(EmployeeDTO employeeDTO) {
        try {
            Employee employee = objectMapperUtils.map(employeeDTO, Employee.class);

            return employeeRepo.save(employee);
        } catch (Exception e) {
            log.error("Exception occurred while saving employee details:", e);
        }
        return null;
    }
}
