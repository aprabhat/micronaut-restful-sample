package com.rest.micronaut.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/files")
public class FileController {

	@Get("/{id}")
	public String getFile(Long id) {
		System.out.println(id);
		return "Hello World";
	}
}
