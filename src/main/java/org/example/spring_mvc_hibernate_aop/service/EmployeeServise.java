package org.example.spring_mvc_hibernate_aop.service;

import org.example.spring_mvc_hibernate_aop.entity.Employee;

import java.util.List;

public interface EmployeeServise {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);
}
