package com.rest.micronaut.configuration;

import javax.inject.Singleton;

import org.modelmapper.ModelMapper;

import io.micronaut.context.annotation.Factory;

@Factory
public class FileServiceConfiguration {
	@Singleton
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}