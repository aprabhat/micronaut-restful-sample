package com.rest.micronaut.configuration;

import javax.inject.Singleton;

import org.modelmapper.ModelMapper;

import io.micronaut.context.annotation.Factory;

@Factory
public class EmployeeServiceConfiguration {
	@Singleton
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}