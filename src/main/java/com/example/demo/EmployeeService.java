package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    // Get all employees
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    // Get employee by ID
    public Employee getEmployeeById(int id) {
        return repository.findById(id).orElse(null);
    }

    // Create or Update employee
    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }

    // Delete employee
    public void deleteEmployee(int id) {
        repository.deleteById(id);
    }
}
