package com.rest.micronaut.controller;

import java.util.List;

import javax.inject.Inject;

import com.rest.micronaut.model.EmployeeDetails;
import com.rest.micronaut.service.EmployeeService;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;

@Controller("/employees")
public class EmployeeController {

	@Inject
	private EmployeeService employeeService;

	@Get
	public List<EmployeeDetails> getAllEmployees() {
		return employeeService.getAllEmployees();
	}

	@Get("/{id}")
	public EmployeeDetails getEmployee(Long id) {
		System.out.println(id);
		return employeeService.getEmployee(id);
	}

	@Post
	public EmployeeDetails saveEmployeeDetails(@Body EmployeeDetails EmployeeDetails) {
		return employeeService.saveEmployeeDetails(EmployeeDetails);
	}

	@Put("/{id}")
	public EmployeeDetails updateEmployeeDetails(Long id, @Body EmployeeDetails EmployeeDetails) throws Exception {
		return employeeService.updateEmployeeDetails(id, EmployeeDetails);
	}

	@Delete("/{id}")
	public void deleteEmployeeDetails(Long id) {
		if(employeeService.isExist(id)) {
			employeeService.deleteEmployeeDetails(id);
		}
		return null;
	}

}
