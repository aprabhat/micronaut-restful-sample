package com.rest.micronaut.configuration;

import javax.inject.Singleton;

import org.modelmapper.ModelMapper;

import io.micronaut.context.annotation.Bean;

@Singleton
public class FileServiceConfiguration {
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
