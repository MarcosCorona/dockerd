package com.example.docker.postgresdocker.employees.application.services;

import java.util.List;

import com.example.docker.postgresdocker.employees.domain.Employee;

public interface EmployeeDao {

List<Employee> findAll();

void insertEmployee(Employee emp);

void updateEmployee(Employee emp);

public void deleteEmployee(Employee emp);
}