package com.rest.micronaut.repository;



import com.rest.micronaut.entity.Employee;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
