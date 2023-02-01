package com.WorkFusion.SpringBootWebApplicationDemo;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EController {
	
	@Autowired
	EService es;

	@PostMapping("/EmployeeData")
	public List<Employee> EmployeeData() {
		return es.EmployeeData();
	}
	
	@GetMapping("/OutputData")
	public Map<String, List<Employee>> getOutputData(){
		return es.getOutputData();
		
	}
}
