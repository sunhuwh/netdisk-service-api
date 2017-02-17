package com.shw.netdisk.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.shw.netdisk.dao.ResourceTypeRepository;
import com.shw.netdisk.domain.ResourceType;
import com.shw.netdisk.service.ResourceTypeService;

@Service
public class ResourceTypeServiceImpl extends BasicServiceImpl implements ResourceTypeService{
	
	@Autowired
    private ResourceTypeRepository resourceTypeRepository;
	
	@Override
	public List<ResourceType> findAll() {
		return resourceTypeRepository.findAll();
	}

	@Override
	public Page<ResourceType> listWithPage(long offset, int limit) {
		long count = resourceTypeRepository.count();
		Pageable pageable = super.createPageable(offset, limit, count);
		return resourceTypeRepository.findAll(pageable);
	}

	@Override
	public ResourceType save(ResourceType resourceType) {
		return resourceTypeRepository.save(resourceType);
	}
	
}
