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
	private EmployeeRepository fileRepository;
	@Inject
	private ModelMapper mapper;

	public List<EmployeeDetails> getAllEmployees() {
		Iterable<Employee> fileEntities = fileRepository.findAll();
		Type type = new TypeToken<List<EmployeeDetails>>() {
		}.getType();
		List<EmployeeDetails> EmployeeDetailss = mapper.map(fileEntities, type);
		return EmployeeDetailss;
	}

	public EmployeeDetails getEmployee(Long id) {
		Optional<Employee> Employee = fileRepository.findById(id);
		if (Employee.isPresent()) {
			return mapper.map(Employee.get(), EmployeeDetails.class);
		}
		return null;
	}

	public EmployeeDetails saveEmployeeDetails(EmployeeDetails EmployeeDetails) {
		Employee Employee = mapper.map(EmployeeDetails, Employee.class);
		System.out.println(Employee.getId());
		Employee savedEmployee = fileRepository.save(Employee);
		EmployeeDetails.setId(savedEmployee.getId());
		return EmployeeDetails;
	}

	public EmployeeDetails updateEmployeeDetails(Long id, EmployeeDetails EmployeeDetails) throws Exception {
		boolean isExist = fileRepository.existsById(id);
		if (isExist) {
			EmployeeDetails.setId(id);
			Employee Employee = mapper.map(EmployeeDetails, Employee.class);
			Employee = fileRepository.update(Employee);
			return mapper.map(Employee, EmployeeDetails.class);
		}
		throw new Exception("File not exist with id " + id);
	}

	public void deleteEmployeeDetails(Long id) {
		fileRepository.deleteById(id);
	}
}
