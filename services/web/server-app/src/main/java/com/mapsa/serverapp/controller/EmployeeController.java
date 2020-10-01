package com.mapsa.serverapp.controller;

import com.mapsa.serverapp.domain.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("employee")
public class EmployeeController {

    @GetMapping
    public ResponseEntity<List<Employee>> findAll(){
        List<Employee> employees = new ArrayList<>();

        Employee employee1 = new Employee(1L, "heli", "darvish");
        Employee employee2 = new Employee(1L, "hossein", "seifi");
        Employee employee3 = new Employee(1L, "ali", "norouzi");

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        return ResponseEntity.ok(employees);
    }

    @PostMapping
    public ResponseEntity<Employee> save(@RequestBody Employee employee){
        return ResponseEntity.ok(employee);
    }
}
