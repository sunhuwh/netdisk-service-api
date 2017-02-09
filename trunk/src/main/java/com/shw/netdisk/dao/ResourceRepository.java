package com.shw.netdisk.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.shw.netdisk.entity.Resource;

public interface ResourceRepository extends MongoRepository<Resource, String>{
	
	
}
