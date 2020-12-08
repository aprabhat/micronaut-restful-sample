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
		return fileService.getAllFiles();
	}

	@Get("/{id}")
	public FileDetail getFile(Long id) {
		System.out.println(id);
		return fileService.getFile(id);
	}

	@Post
	public FileDetail saveFileDetails(@Body FileDetail fileDetail) {
		return fileService.saveFileDetails(fileDetail);
	}

	@Post("/{id}")
	public FileDetail updateFileDetails(Long id, @Body FileDetail fileDetail) {
		return fileService.saveFileDetails(fileDetail);
	}

	@Delete("/{id}")
	public void deleteFileDetail(Long id) {
		fileService.deleteFileDetail(id);
	}

}
