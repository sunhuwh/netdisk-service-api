package com.shw.netdisk.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.shw.netdisk.dao.ResourceRepository;
import com.shw.netdisk.domain.Resource;
import com.shw.netdisk.service.ResourceService;

@Service
public class ResourceServiceImpl extends BasicServiceImpl implements ResourceService{
	
	@Autowired
    private ResourceRepository resourceRepository;
	
	@Override
	public List<Resource> findAll() {
		return resourceRepository.findAll();
	}

	@Override
	public Page<Resource> listWithPage(long offset, int limit) {
		long count = resourceRepository.count();
		Pageable pageable = super.createPageable(offset, limit, count);
		return resourceRepository.findAll(pageable);
	}
	
	@Override
	public List<Resource> findByType(String typeId, Integer offset, Integer limit) {
		return resourceRepository.findByTypeId(typeId);
	} 
	
	@Override
	public Resource findById(String id) {
		return resourceRepository.findOne(id);
	}

	@Override
	public Resource save(Resource resource) {
		return resourceRepository.save(resource);
	}
	
	@Override
	public void delete(String id){
		resourceRepository.delete(id);
	}

	
}
