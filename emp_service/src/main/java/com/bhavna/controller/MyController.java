package com.bhavna.controller;

import com.bhavna.entity.Employee;
import com.bhavna.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class MyController {

    @Autowired
private EmployeeService employeeService;

@Autowired
private RestTemplate restTemplate;

    @GetMapping("/{empId}")
public Employee getEmployee(@PathVariable("empId") Long empId){
Employee employee =this.employeeService.getEmployee(empId);
        List contacts = this.restTemplate.getForObject("http://contact-service/contact/emp/" +employee.getEmpId(),List.class);
        employee.setContacts(contacts);
        return employee;
    }
}
