package com.example.employeespring.controller;

import com.example.employeespring.model.Employee;
import com.example.employeespring.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    @GetMapping("/{id}")
    public Employee findById(@PathVariable int id) {
        return employeeService.findById(id);
    }

    @PostMapping
    public void save(@RequestBody Employee employee) {
        employeeService.save(employee);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable int id, @RequestBody Employee employee) {
        employee.setId(id);
        employeeService.update(employee);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        employeeService.deleteById(id);
    }
}
