package com.example.docker.postgresdocker.employees.domain;

import lombok.Data;

import javax.persistence.Table;

@Data
@Table(name="employee")
public class Employee {
    private String employeeId;
    private String employeeName;
    private String employeeEmail;
    private String employeeAddress;

}
