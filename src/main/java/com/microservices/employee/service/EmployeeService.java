package com.microservices.employee.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.employee.entity.Employee;
import com.microservices.employee.repository.EmployeeRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee save(Employee employee){
		Mono<Employee> emp=  employeeRepository.save(employee);
		Employee newEmp = emp.block();
		return newEmp;
	}
	
	public Employee findById(String id){
		 Mono<Employee> findById = employeeRepository.findById(id);
		 return findById.block();
	}
	
	public List<Employee> findAll(){
		 Flux<Employee> findAll = employeeRepository.findAll();
		 return findAll.toStream().collect(Collectors.toList());
	}
	
	
}
