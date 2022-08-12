package com.example.demo.controller;

import com.example.demo.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping
    public void saveEmployees(){
        employeeService.saveEmployee();
    }


    @GetMapping("/update")
    public void updateEmployees(){
        employeeService.updateEmployee();
    }
}
