package com.ifi.microservice.service.imp;

import com.ifi.microservice.entity.Department;
import com.ifi.microservice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class DepartmentServiceImp implements DepartmentService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Department getDepartment(int id) {
        Department departmentDTO = new Department();
        departmentDTO.setIdDpm(id);
        List<Object> employees = restTemplate.getForObject("http://employee-service/employees/abc", List.class);
        departmentDTO.setEmployees(employees);
        return departmentDTO;
    }
}
