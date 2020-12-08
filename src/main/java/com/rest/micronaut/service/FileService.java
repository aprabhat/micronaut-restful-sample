package com.rest.micronaut.service;

import java.lang.reflect.Type;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;

import com.rest.micronaut.Entity.FileEntity;
import com.rest.micronaut.Model.FileDetail;
import com.rest.micronaut.repository.FileRepository;

import io.micronaut.http.annotation.Body;

@Singleton
public class FileService {
	@Inject
	private FileRepository fileRepository;
	private ModelMapper mapper = new ModelMapper();

	public List<FileDetail> getAllFiles() {
		Iterable<FileEntity> fileEntities = fileRepository.findAll();
		Type type = new TypeToken<List<FileDetail>>() {
		}.getType();
		List<FileDetail> fileDetails = mapper.map(fileEntities, type);
		return fileDetails;
	}

	public FileDetail getFile(Long id) {
		// TODO: Logic to fetch file details from DB
		FileDetail fileDetail = new FileDetail();
		System.out.println(id);
		return fileDetail;
	}

	public FileDetail saveFileDetails(FileDetail fileDetail) {
		FileEntity fileEntity = mapper.map(fileDetail, FileEntity.class);
		System.out.println(fileEntity.getId());
		FileEntity savedFileEntity = fileRepository.save(fileEntity);
		fileDetail.setId(savedFileEntity.getId());
		return fileDetail;
	}

	public FileDetail updateFileDetails(@Body FileDetail fileDetail) {
		return fileDetail;
	}

	public void deleteFileDetail(Long id) {
		fileRepository.deleteById(id);
	}
}
