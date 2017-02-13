package com.shw.netdisk.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.shw.netdisk.domain.Resource;

public interface ResourceRepository extends MongoRepository<Resource, String>{
	
	
}
