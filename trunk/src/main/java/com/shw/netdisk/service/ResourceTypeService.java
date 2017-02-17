package com.shw.netdisk.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.shw.netdisk.domain.ResourceType;

public interface ResourceTypeService {
	
	List<ResourceType> findAll();

	Page<ResourceType> listWithPage(long offset, int limit);

	ResourceType save(ResourceType resourceType);

}
