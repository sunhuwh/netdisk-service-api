package com.shw.netdisk.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.shw.netdisk.domain.ResourceType;

public interface ResourceTypeRepository extends MongoRepository<ResourceType, String>{
	
	
}
