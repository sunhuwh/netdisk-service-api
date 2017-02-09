package com.shw.netdisk.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shw.netdisk.dao.ResourceRepository;
import com.shw.netdisk.entity.Resource;
import com.shw.netdisk.service.ResourceService;

@Service
public class ResourceServiceImpl implements ResourceService{
	
	@Autowired
    private ResourceRepository resourceRepository;
	
	@Override
	public List<Resource> findAll() {
		return resourceRepository.findAll();
	}
	
}
