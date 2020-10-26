package com.rest.micronaut.repository;

import com.rest.micronaut.Entity.FileEntity;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface FileRepository extends CrudRepository<FileEntity, Long> {

}
