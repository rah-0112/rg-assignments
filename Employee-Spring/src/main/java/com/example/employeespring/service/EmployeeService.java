package com.example.employeespring.service;

import com.example.employeespring.dao.EmployeeDAO;
import com.example.employeespring.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeDAO employeeDAO;

    public EmployeeService(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    public Employee findById(int id) {
        return employeeDAO.findById(id);
    }

    public void save(Employee employee) {
        employeeDAO.save(employee);
    }

    public void update(Employee employee) {
        employeeDAO.update(employee);
    }

    public void deleteById(int id) {
        employeeDAO.deleteById(id);
    }
}
