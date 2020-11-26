package com.ildar.sprinlearning.service;

import com.ildar.sprinlearning.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

        void insertEmployee(Employee emp);

        void updateEmployee(Employee emp);

        void executeUpdateEmployee(Employee emp);

        void deleteEmployee(Employee emp);
}
