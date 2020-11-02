package com.ifi.microservice.service;

import com.ifi.microservice.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeService {

    List<EmployeeDTO> getAllEmployees();
}
