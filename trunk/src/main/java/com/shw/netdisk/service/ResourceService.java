package com.shw.netdisk.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.shw.netdisk.domain.Resource;

public interface ResourceService {
	
	List<Resource> findAll();

	Page<Resource> listWithPage(long offset, int limit);

	List<Resource> findByType(String typeId, Integer offset, Integer limit);

	Resource findById(String id);

	Resource save(Resource resource);

	void delete(String id);

	List<Resource> findByName(String name, Integer offset, Integer limit);

}
