package com.mapsa.clientapp.client;

import com.mapsa.clientapp.data.Employee;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class EmployeeServerAppClient {

    public List<Employee> employees(){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<Employee>> listResponseEntity = restTemplate
                .exchange("http://localhost:8080/employee",
                        HttpMethod.GET,
                        null,
                        new ParameterizedTypeReference<List<Employee>>() {});
        List<Employee> employees = listResponseEntity.getBody();
        return employees;
    }
}
