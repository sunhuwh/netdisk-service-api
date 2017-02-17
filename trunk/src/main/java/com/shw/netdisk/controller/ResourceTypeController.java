package com.shw.netdisk.controller;

import java.util.Map;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shw.netdisk.domain.Resource;
import com.shw.netdisk.domain.ResourceType;
import com.shw.netdisk.entity.result.ApiResult;
import com.shw.netdisk.service.ResourceTypeService;

import io.swagger.annotations.ApiParam;

@RestController
public class ResourceTypeController implements ControllerHelper {
	
	@Autowired
	private ResourceTypeService resourceTypeService;
	
	@GetMapping("/resource_types")
	public ApiResult listAll(
			@ApiParam(value = "偏移量")
    		@RequestParam(required = false, name="$offset", defaultValue = "0") Integer offset, 
    		@ApiParam(value = "查询数量")
    		@RequestParam(required = false, name="$limit", defaultValue="100") Integer limit){
		return new ApiResult(HttpStatus.OK, resourceTypeService.listWithPage(offset, limit));
	}
	
	@PostMapping(value = "/resource_type/save")
	public ApiResult save(String name){
		ResourceType entity = new ResourceType();
		ObjectId id = new ObjectId();
		entity.setId(id);
		entity.setName(name);
		entity.setOrder(System.currentTimeMillis());
		ResourceType resource = resourceTypeService.save(entity);
		@SuppressWarnings("unchecked")
		Map<String, Resource> data = map("data", resource);
		return new ApiResult(HttpStatus.OK, data);
	}
	
}
