package com.example.docker.postgresdocker.employees.infraestructure.controller;

import java.util.List;

import javax.annotation.Resource;

import com.example.docker.postgresdocker.employees.application.services.EmployeeDao;
import com.example.docker.postgresdocker.employees.domain.Employee;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/postgressApp")
public class ApplicationController {

@Resource
EmployeeDao employeeService;

@GetMapping(value = "/employeeList")
public List<Employee> getEmployees() {
return employeeService.findAll();

}

@PostMapping(value = "/createEmp")
public void createEmployee(@RequestBody Employee emp) {
 employeeService.insertEmployee(emp);

}
@PutMapping(value = "/updateEmp")
public void updateEmployee(@RequestBody Employee emp) {
 employeeService.updateEmployee(emp);

}
@PutMapping(value = "/executeUpdateEmp")
public void executeUpdateEmployee(@RequestBody Employee emp) {
 employeeService.executeUpdateEmployee(emp);

}

@DeleteMapping(value = "/deleteEmpById")
public void deleteEmployee(@RequestBody Employee emp) {
 employeeService.deleteEmployee(emp);

}


}