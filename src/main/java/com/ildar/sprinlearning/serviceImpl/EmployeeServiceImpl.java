package com.ildar.sprinlearning.serviceImpl;

import com.ildar.sprinlearning.entity.EmployeeDao;
import com.ildar.sprinlearning.model.Employee;
import com.ildar.sprinlearning.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
@Resource
    EmployeeDao employeeDao;
    @Override
    public List<Employee> findAll() {
        return employeeDao.findAll();
    }

    @Override
    public void insertEmployee(Employee emp) {
        employeeDao.insertEmployee(emp);

    }

    @Override
    public void updateEmployee(Employee emp) {
        employeeDao.updateEmployee(emp);

    }

    @Override
    public void executeUpdateEmployee(Employee emp) {
        employeeDao.executeUpdateEmployee(emp);

    }

    @Override
    public void deleteEmployee(Employee emp) {
employeeDao.deleteEmployee(emp);
    }
}
