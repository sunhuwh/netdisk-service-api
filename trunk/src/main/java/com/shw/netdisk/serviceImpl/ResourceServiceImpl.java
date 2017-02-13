package com.shw.netdisk.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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
		int page = super.getPage(offset, limit, count);
		Pageable pageable = new PageRequest(page, 100);
		return resourceRepository.findAll(pageable);
	}

	@Override
	public Resource save(Resource resource) {
		return resourceRepository.save(resource);
	}
	
}
