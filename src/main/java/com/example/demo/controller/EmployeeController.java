package com.example.demo.controller;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    private EmployeeServiceImpl service;

    @PostMapping("/saveEmployee")
    public Employee saveEmployee(@RequestBody Employee employee){
        return service.saveEmployee(employee);
    }

    @PostMapping("/saveAllEmployees")
    public List<Employee> saveAllEmployee(@RequestBody List<Employee> employees){
        return service.saveAllEmployee(employees);
    }
    @GetMapping("/getEmployee/{id}")
    public Employee getEmployeeById(@PathVariable long id){
        return service.getEmployeeById(id);
    }

    @GetMapping("/getAllEmployee")
    public List<Employee> getAllEmployee(){
        return service.getAllEmployee();
    }

    @PutMapping("/updateEmployee/{id}")
    public Employee updateEmployee(@RequestBody Employee employee,@PathVariable long id){
        return service.updateEmployee(employee, id);
    }

    @DeleteMapping("/deleteEmployee/{id}")
    public String deleteById(@PathVariable long id){
        return service.deleteById(id);

    }

}
