package com.rest.micronaut.model;

import lombok.Data;

@Data
public class EmployeeDetails {
	private Long id;
	private String name;
	private String role;
}