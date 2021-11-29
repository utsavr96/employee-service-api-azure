package com.microservices.employee.entity;

import org.springframework.data.annotation.Id;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;

@Container(containerName = "company")
public class Company {
	
	@Id
	@GeneratedValue
	private String id;
	
	@PartitionKey
	private String name;
	
	private String baseBranch;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBaseBranch() {
		return baseBranch;
	}

	public void setBaseBranch(String baseBranch) {
		this.baseBranch = baseBranch;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", baseBranch=" + baseBranch + "]";
	}

	public Company(String name, String baseBranch) {
		super();
		this.name = name;
		this.baseBranch = baseBranch;
	}

	public Company() {
		super();
	}
	
	
}
