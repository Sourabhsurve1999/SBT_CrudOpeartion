package com.example.demo.service;

import com.example.demo.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {

    Employee saveEmployee(Employee employee);

    List<Employee>saveAllEmployee(List<Employee>employees);

    Employee getEmployeeById(long id);

    List<Employee> getAllEmployee();

    Employee updateEmployee(Employee employee,long id);

    String deleteById(long id);
}
