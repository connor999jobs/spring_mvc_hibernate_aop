package org.example.spring_mvc_hibernate_aop.service;

import org.example.spring_mvc_hibernate_aop.dao.EmployeeDao;
import org.example.spring_mvc_hibernate_aop.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiseImpl implements EmployeeServise{

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    @Transactional

    public List<Employee> getAllEmployees() {
        return employeeDao.getAllEmployees();
    }

    @Override
    @Transactional
    public void saveEmployee(Employee employee) {
        employeeDao.saveEmployee(employee);
    }
}
