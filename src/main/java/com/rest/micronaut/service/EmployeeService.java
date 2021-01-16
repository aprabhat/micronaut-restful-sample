package com.rest.micronaut.service;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;

import com.rest.micronaut.entity.Employee;
import com.rest.micronaut.model.EmployeeDetails;
import com.rest.micronaut.repository.EmployeeRepository;

@Singleton
public class EmployeeService {
	@Inject
	private EmployeeRepository employeeRepository;
	@Inject
	private ModelMapper mapper;

	public List<EmployeeDetails> getAllEmployees() {
		Iterable<Employee> employees = employeeRepository.findAll();
		Type type = new TypeToken<List<EmployeeDetails>>() {
		}.getType();
		return mapper.map(employees, type);
	}

	public EmployeeDetails getEmployee(Long id) {
		Optional<Employee> Employee = employeeRepository.findById(id);
		if (Employee.isPresent()) {
			return mapper.map(Employee.get(), EmployeeDetails.class);
		}
		return null;
	}

	public EmployeeDetails saveEmployeeDetails(EmployeeDetails EmployeeDetails) {
		Employee Employee = mapper.map(EmployeeDetails, Employee.class);
		System.out.println(Employee.getId());
		Employee savedEmployee = employeeRepository.save(Employee);
		EmployeeDetails.setId(savedEmployee.getId());
		return EmployeeDetails;
	}

	public EmployeeDetails updateEmployeeDetails(Long id, EmployeeDetails EmployeeDetails) throws Exception {
		boolean isExist = employeeRepository.existsById(id);
		if (isExist) {
			EmployeeDetails.setId(id);
			Employee Employee = mapper.map(EmployeeDetails, Employee.class);
			Employee = employeeRepository.update(Employee);
			return mapper.map(Employee, EmployeeDetails.class);
		}
		throw new Exception("Employee not exist with id " + id);
	}

	public void deleteEmployeeDetails(Long id) {
		employeeRepository.deleteById(id);
	}
	
	public boolean isExist(Long id) {
		return employeeRepository.existsById(id);
	}
}
