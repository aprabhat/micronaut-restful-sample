package com.rest.micronaut.Model;

import lombok.Data;

@Data
public class FileDetail {
	private Long fileId;
	private String name;
	private String path;
}