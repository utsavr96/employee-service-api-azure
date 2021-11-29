package com.microservices.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.employee.entity.Employee;
import com.microservices.employee.service.EmployeeService;

@RestController
@RequestMapping
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping
	public String statusCheck() {
		return "Up and running";
	}
	
	@PostMapping("/employee")
	public Employee save(@RequestBody Employee employee) {
		return employeeService.save(employee);
	}
	
	@GetMapping(value = "employee/{id}")
	public Employee findById(@PathVariable String id) {
		return employeeService.findById(id);
	}
	
	@GetMapping("/employees")
	public List<Employee> findAll(){
		return employeeService.findAll();
	}
	
	
	
	
}
