package com.rest.micronaut.controller;

import java.util.List;

import javax.inject.Inject;

import com.rest.micronaut.Model.FileDetail;
import com.rest.micronaut.service.FileService;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;

@Controller("/files")
public class FileController {

	@Inject
	private FileService fileService;

	@Get
	public List<FileDetail> getAllFiles() {
		// TODO: Logic to fetch file details from DB
		List<FileDetail> fileDetails = null;
		return fileDetails;
	}

	@Get("/{id}")
	public FileDetail getFile(Long id) {
		// TODO: Logic to fetch file details from DB
		FileDetail fileDetail = null;
		System.out.println(id);
		return fileDetail;
	}

	@Post
	public FileDetail saveFileDetails(@Body FileDetail fileDetail) {
		// TODO: Logic to persist file details in DB
		return fileDetail;
	}

	@Post
	public FileDetail updateFileDetails(@Body FileDetail fileDetail) {
		// TODO: Logic to update file details in DB
		return fileDetail;
	}

	@Delete("/{id}")
	public void deleteFileDetail(Long id) {
		// TODO: Logic to delete record from DB
		System.out.println(fileService);
	}

}
