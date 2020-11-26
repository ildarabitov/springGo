package com.ildar.sprinlearning.entity;

import com.ildar.sprinlearning.dao.EmployeeImpl;
import com.ildar.sprinlearning.model.Employee;

import java.util.List;

public interface EmployeeDao {
    List<Employee> findAll();
    void insertEmployee(Employee emp);
    void updateEmployee(Employee emp);
    void executeUpdateEmployee(Employee emp);

public void deleteEmployee(Employee emp);

}
