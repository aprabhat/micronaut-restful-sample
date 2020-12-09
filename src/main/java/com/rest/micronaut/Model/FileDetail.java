package com.rest.micronaut.model;

import lombok.Data;

@Data
public class FileDetail {
	private Long id;
	private String name;
	private String path;
}