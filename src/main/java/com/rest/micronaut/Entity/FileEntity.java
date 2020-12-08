package com.rest.micronaut.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "file_entity")
public class FileEntity implements Serializable{

	private static final long serialVersionUID = 6793404341176404979L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long fileId;
	private String name;
	private String path;
}
