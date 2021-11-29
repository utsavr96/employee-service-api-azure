package com.microservices.employee;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.microservices.employee.entity.Employee;
import com.microservices.employee.repository.EmployeeRepository;
import com.microservices.employee.service.EmployeeService;

@SpringBootApplication
public class EmployeeServiceApplication implements CommandLineRunner{
	
	Logger LOG=LoggerFactory.getLogger(EmployeeServiceApplication.class);
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private EmployeeService employeeService;
	
	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		this.employeeRepository.deleteAll().block();
		
	}

}
