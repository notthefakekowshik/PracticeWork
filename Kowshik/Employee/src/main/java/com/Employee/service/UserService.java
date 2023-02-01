package com.Employee.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.Employee.model.Employee;
import org.springframework.stereotype.Service;

@Service
public class UserService 
{
    
    List<Employee> listOfEmployees = new ArrayList<>();
    Map<String,List<Employee>> filteredEmployeesData;
    
    public Map<String,List<Employee>> getFilteredEmployees() 
    {
        
        filteredEmployeesData = listOfEmployees.stream().filter(x -> x.getAge() >= 25 && x.getAge() <= 40).sorted((obj1,obj2) -> obj1.getName().compareTo(obj2.getName())).collect(Collectors.toList()).stream().collect(Collectors.groupingBy(curr->curr.getLocation().toLowerCase()));
        return filteredEmployeesData;
    }
    
    
    public String saveEmployees() 
    {
        listOfEmployees.add(new Employee("Kowshik",25,"Vijayawada"));
        listOfEmployees.add(new Employee("Hari" , 27,  "Kanchikacharla"));
        listOfEmployees.add(new Employee("Roja" , 28,"Hyd"));
        listOfEmployees.add(new Employee("Elon" , 60 ,"mars"));
        listOfEmployees.add(new Employee("virat",32,"Delhi"));
        listOfEmployees.add(new Employee("dhawan" , 35,"delhi"));
        return "Employees saved";
    }
    
    public List<Employee> getAllEmployees()
    {
        return listOfEmployees;
    }
    
    public List<Employee> getFilteredEmployeesBasedOnLocation(String location)
    {
       return filteredEmployeesData.get(location) ;
    }
}
