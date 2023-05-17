package com.example.demo.service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl  implements EmployeeService{
    @Autowired
    private EmployeeRepo repo;
    @Override
    public Employee saveEmployee(Employee employee) {
        return repo.save(employee);
    }

    @Override
    public List<Employee> saveAllEmployee(List<Employee> employees) {
        return repo.saveAll(employees);
    }

    @Override
    public Employee getEmployeeById(long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return repo.findAll();
    }

    @Override
    public Employee updateEmployee(Employee employee, long id) {
        Employee existingEmployee=getEmployeeById(id);
        existingEmployee.setFirstName(employee.getFirstName());
        existingEmployee.setLastName(employee.getLastName());
        existingEmployee.setRole(employee.getRole());
        existingEmployee.setEmail(employee.getEmail());
        return  repo.save(existingEmployee);
    }

    @Override
    public String deleteById(long id) {
        repo.deleteById(id);
        return "deleted.";
    }
}
