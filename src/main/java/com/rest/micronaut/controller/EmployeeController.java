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

@Controller("/employees")
public class EmployeeController {

	@Inject
	private EmployeeService employeeService;

	@Get
	public List<EmployeeDetails> getAllFiles() {
		return employeeService.getAllFiles();
	}

	@Get("/{id}")
	public EmployeeDetails getFile(Long id) {
		System.out.println(id);
		return employeeService.getFile(id);
	}

	@Post
	public EmployeeDetails saveEmployeeDetailss(@Body EmployeeDetails EmployeeDetails) {
		return employeeService.saveEmployeeDetailss(EmployeeDetails);
	}

	@Post("/{id}")
	public EmployeeDetails updateEmployeeDetailss(Long id, @Body EmployeeDetails EmployeeDetails) throws Exception {
		return employeeService.updateEmployeeDetailss(id, EmployeeDetails);
	}

	@Delete("/{id}")
	public void deleteEmployeeDetails(Long id) {
		employeeService.deleteEmployeeDetails(id);
	}

}
