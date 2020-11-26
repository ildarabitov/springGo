package com.ildar.sprinlearning.model;

import lombok.Builder;
import lombok.Data;

@Data
public class Employee {
    public Employee(){

    }
    String employeeId;
    String employeeName;
    String employeeEmail;
    String employeeAddress;
}
