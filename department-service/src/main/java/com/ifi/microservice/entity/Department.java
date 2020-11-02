package com.ifi.microservice.entity;

import lombok.Data;
import java.util.List;

@Data
public class Department {

    private int idDpm;
    private List<Object> employees;

}
