package org.example.spring_mvc_hibernate_aop.dao;

import org.example.spring_mvc_hibernate_aop.entity.Employee;

import java.util.List;

public interface EmployeeDao {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);
}
