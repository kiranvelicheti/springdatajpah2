package com.example.demo.service;

import com.example.demo.entity.Employees;
import com.example.demo.repository.EmployeesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeesRepository employeesRepository;

@Transactional
    public void saveEmployee(){

        employeesRepository.saveAll(IntStream.range(1, 10000)
                .mapToObj(i -> Employees
                        .builder()
                        .id(i)
                        .firstName("Name" + i+ " Insert")
                        .lastName("Name" + i+ " Insert")
                        .email("email@" + i+ " Insert")
                        .build())
                .collect(Collectors.toList()));
    }

    public void updateEmployee(){

        employeesRepository.saveAll(IntStream.range(1, 10000)
                .mapToObj(i -> Employees
                        .builder()
                        .id(i)
                        .firstName("Name" + i+ " Update")
                        .lastName("Name" + i+" Update")
                        .email("email@" + i+" Update")
                        .build())
                .collect(Collectors.toList()));
    }
}
