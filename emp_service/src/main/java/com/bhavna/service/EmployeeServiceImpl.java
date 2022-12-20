package com.bhavna.service;

import com.bhavna.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    List<Employee> list = List.of(
            new Employee(901L,"Ram","8923955"),
            new Employee(902L,"Jam","8943955"),
            new Employee(903L,"Tam","89634955")
    );

    @Override
    public Employee getEmployee(Long id) {
        return this.list.stream().filter(user -> user.getEmpId().equals(id)).findAny().orElse(null);
    }
}
