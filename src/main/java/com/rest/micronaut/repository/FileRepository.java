package com.rest.micronaut.repository;

import com.rest.micronaut.Entity.FileEntity;

import io.micronaut.data.repository.CrudRepository;

public interface FileRepository extends CrudRepository<FileEntity, Long> {

}
