package com.ifi.microservice.controller;

import com.ifi.microservice.entity.Department;
import com.ifi.microservice.service.imp.DepartmentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentServiceImp departmentServiceImp;

    @GetMapping("/{id}")
    public Department getDepartment(@PathVariable int id){
        return departmentServiceImp.getDepartment(id);
    }
}
