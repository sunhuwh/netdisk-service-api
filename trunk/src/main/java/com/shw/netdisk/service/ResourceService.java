package com.shw.netdisk.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.shw.netdisk.domain.Resource;

public interface ResourceService {
	
	List<Resource> findAll();

	Page<Resource> listWithPage(long offset, int limit);

	Resource save(Resource resource);

}
