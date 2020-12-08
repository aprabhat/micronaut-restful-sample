package com.rest.micronaut.repository;

import com.rest.micronaut.Entity.FileEntity;

import io.micronaut.context.annotation.Executable;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface FileRepository extends CrudRepository<FileEntity, Long> {
	
	@Executable
	public FileEntity findByFileId(Long id);
	
	@Executable
	public void deleteByFileId(Long id);
}
