package com.WorkFusion.SpringBootWebApplicationDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class EService {
		
	List<Employee> emp = new ArrayList<Employee>();
	Map<String, List<Employee>> OutputData;
	
	
	public Map<String, List<Employee>> getOutputData() {
		OutputData = emp.stream().sorted((n1,n2)-> n1.getEname().compareTo(n2.getEname()))
	               			.filter(curr -> curr.getEage()>=25 && curr.getEage() <=40)
	               			.collect(Collectors.groupingBy(Employee::getEloc));
		return OutputData;

	}


	public List<Employee> EmployeeData() {
		// TODO Auto-generated method stub
		 	emp.add(new Employee("Hari","Hyd",22));
	        emp.add(new Employee("Kumar","Vij",25));
	        emp.add(new Employee("Ravi","Kadapa",39));
	        emp.add(new Employee("B","Hyd",27));
	        emp.add(new Employee("Ram","Vij",28));
	        emp.add(new Employee("A","Hyd",30));
			return emp;
		
	}
	
	
	
	
}
