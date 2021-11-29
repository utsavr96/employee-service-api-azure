package com.microservices.employee.repository;

import org.springframework.stereotype.Repository;

import com.azure.spring.data.cosmos.repository.ReactiveCosmosRepository;
import com.microservices.employee.entity.Employee;

@Repository
public interface EmployeeRepository extends ReactiveCosmosRepository<Employee, String>{

}
