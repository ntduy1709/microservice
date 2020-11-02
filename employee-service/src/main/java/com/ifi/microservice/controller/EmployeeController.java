package com.ifi.microservice.controller;

import com.ifi.microservice.dto.EmployeeDTO;
import com.ifi.microservice.service.imp.EmployeeServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeServiceImp employeeServiceImp;

    @GetMapping(value = "/abc")
    public List<EmployeeDTO> getAllEmployees(){
        return employeeServiceImp.getAllEmployees();
    }
}
