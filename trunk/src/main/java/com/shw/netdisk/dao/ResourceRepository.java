package com.shw.netdisk.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.shw.netdisk.domain.Resource;

public interface ResourceRepository extends MongoRepository<Resource, String>{
	
	List<Resource> findById(String id);

	List<Resource> findByTypeId(String typeId);
	
}
