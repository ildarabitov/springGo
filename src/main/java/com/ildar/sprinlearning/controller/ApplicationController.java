package com.ildar.sprinlearning.controller;

import com.ildar.sprinlearning.model.Employee;
import com.ildar.sprinlearning.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ApplicationController {
    @Resource
    EmployeeService employeeService;
    @GetMapping(value = "/employeeList")
    public List<Employee> getEmployees() {
        return employeeService.findAll();

    }

    @PostMapping(value = "/createEmp")
    public void createEmployee( Employee emp) {
        employeeService.insertEmployee(emp);

    }
    @PutMapping(value = "/updateEmp")
    public void updateEmployee( Employee emp) {
        employeeService.updateEmployee(emp);

    }
    @PutMapping(value = "/executeUpdateEmp")
    public void executeUpdateEmployee( Employee emp) {
        employeeService.executeUpdateEmployee(emp);

    }

    @DeleteMapping(value = "/deleteEmpById")
    public void deleteEmployee( Employee emp) {
        employeeService.deleteEmployee(emp);

    }
}
