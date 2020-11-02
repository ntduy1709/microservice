package com.ifi.microservice.service.imp;

import com.ifi.microservice.dto.EmployeeDTO;
import com.ifi.microservice.entity.Employee;
import com.ifi.microservice.repository.EmployeeRepository;
import com.ifi.microservice.service.EmployeeService;
import org.checkerframework.checker.units.qual.A;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImp implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private ModelMapper mapper;

    @Override
    public List<EmployeeDTO> getAllEmployees() {
        List<Employee> employeeList = employeeRepository.findAll();
        List<EmployeeDTO> employeeDTOList = new ArrayList<>();
        for (Employee employee : employeeList) {
            EmployeeDTO employeeDTO = mapper.map(employee, EmployeeDTO.class);
            employeeDTOList.add(employeeDTO);
        }
        return employeeDTOList;
    }
}
