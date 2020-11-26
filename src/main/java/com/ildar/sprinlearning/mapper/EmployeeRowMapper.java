package com.ildar.sprinlearning.mapper;

import com.ildar.sprinlearning.dao.EmployeeImpl;
import com.ildar.sprinlearning.model.Employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeRowMapper implements RowMapper<Employee> {
    @Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        Employee emp = new Employee();
        emp.setEmployeeId(rs.getString("employeeId"));
        emp.setEmployeeName(rs.getString("employeeName"));
        emp.setEmployeeEmail(rs.getString("employeeEmail"));
        emp.setEmployeeAddress(rs.getString("employeeAddress"));
        return emp;
    }
}
