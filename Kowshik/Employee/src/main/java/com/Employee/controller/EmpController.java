package com.Employee.controller;

import java.util.List;
import java.util.Map;

import com.Employee.model.Employee;
import com.Employee.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController 
{
    
    @Autowired
    UserService Us;
    
    @GetMapping("/getFilteredEmployees")
    public Map<String,List<Employee>> getFilteredEmployees()
    {
        
        return Us.getFilteredEmployees();
    }
    
    @GetMapping("/getAllEmployess")
    public List<Employee> getAllEmployees()
    {
        return Us.getAllEmployees();
    }
    
    @GetMapping("/getFilteredEmployeesBasedOnLocation/{location}")
    public List<Employee> getFilteredEmployeesBasedOnLocation(@PathVariable("location") String location)
    {
        return Us.getFilteredEmployeesBasedOnLocation(location.toLowerCase());
    }
    
    @PostMapping("/saveEmployees")
    public String saveEmployees()
    {
        return Us.saveEmployees();
    }
}
