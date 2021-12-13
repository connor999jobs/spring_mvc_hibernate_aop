package org.example.spring_mvc_hibernate_aop.controller;

import org.example.spring_mvc_hibernate_aop.dao.EmployeeDao;
import org.example.spring_mvc_hibernate_aop.entity.Employee;
import org.example.spring_mvc_hibernate_aop.service.EmployeeServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    private EmployeeServise employeeServise;


    @RequestMapping("/")
    public String showAllEmployees(Model model){
        List<Employee> allEmployees = employeeServise.getAllEmployees();
        model.addAttribute("allEmps",allEmployees);
        return "all-employees";
    }

    @RequestMapping("/addNewEmploee")
    public String addNewEmployee(Model model){
        Employee employee = new Employee();
        model.addAttribute(employee);
        return "employee-info";
    }

    @RequestMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee")  Employee employee){
        return "redirect:/";
    }
}
