package com.microservices.employee.entity;

import org.springframework.data.annotation.Id;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;

@Container(containerName = "employee")
public class Employee {
	
	@Id
	@GeneratedValue
	private String id;
	
	private String email;
	
	private String firstName;
	
	private String lastName;
	
	private String address;
	
	@PartitionKey
	private String company;
	
	

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", email=" + email + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", address=" + address + ", company=" + company + "]";
	}

	

	public Employee(String email, String firstName, String lastName, String address, String company) {
		super();
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.company = company;
	}

	public Employee() {
		super();
	}
	
	
}
