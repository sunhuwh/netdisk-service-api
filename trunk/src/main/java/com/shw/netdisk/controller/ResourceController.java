package com.shw.netdisk.controller;

import java.util.List;
import java.util.Map;

import org.assertj.core.util.Lists;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shw.netdisk.domain.Resource;
import com.shw.netdisk.entity.result.ApiResult;
import com.shw.netdisk.service.ResourceService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
public class ResourceController implements ControllerHelper{
	
	@Autowired
    private ResourceService resourceService;
	
	@ApiOperation(value = "query all resources", notes="", responseReference = "application/json")
    @GetMapping(value = "/resources")
    public ApiResult listWithPage(
    		@ApiParam(value = "偏移量")
    		@RequestParam(required = false, name="$offset", defaultValue = "0") int offset, 
    		@ApiParam(value = "查询数量")
    		@RequestParam(required = false, name="$limit", defaultValue="100") int limit){
		Page<Resource> pageResource = resourceService.listWithPage(offset, limit);
    	return new ApiResult(HttpStatus.OK, pageResource);
    }
	
	@ApiOperation(value = "查找资源", notes="根据关键字查找资源")
    @GetMapping(value = "/resources/search", params={"key"})
    public ApiResult search(
    		@ApiParam(value="查询的关键字")
    		@RequestParam(required = true, name="key") String key, 
    		@ApiParam(value = "偏移量")
    		@RequestParam(required = false, name="$offset", defaultValue = "0") Integer offset, 
    		@ApiParam(value = "查询数量")
    		@RequestParam(required = false, name="$limit", defaultValue="100") Integer limit, 
    		@ApiParam(allowMultiple = true, value = "过滤条件，可以是name, type")
    		@RequestParam(required = false, name="filter") String filter){
		List<Resource> resources = Lists.newArrayList();
		switch (filter) {
		case "type":
			resources = resourceService.findByType(key, offset, limit);
		default:
			//resources = resourceService。;
		}
		@SuppressWarnings("unchecked")
		Map<String, Resource> data = map("status", HttpStatus.OK, "items", resources );
    	return new ApiResult(HttpStatus.OK, data);
    }
	
	@PostMapping(value = "/resource/save")
	public ApiResult save(String name, String description, String resourceTypeId, String url){
		Resource entity = new Resource();
		ObjectId id = new ObjectId();
		entity.setId(id);
		entity.setName(name);
		entity.setUrl(url);
		entity.setTypeId(resourceTypeId);
		entity.setDescription(description);
		Resource resource = resourceService.save(entity);
		@SuppressWarnings("unchecked")
		Map<String, Resource> data = map("data", resource);
		return new ApiResult(HttpStatus.OK, data);
	}
	
	@PutMapping(value = "/resource/{id}")
	public ApiResult update(String id, String name, String description, String resourceTypeId, String url){
		Resource oldResource = resourceService.findById(id);
		Resource entity = new Resource();
		entity.setId(oldResource.getId());
		entity.setName(name);
		entity.setUrl(url);
		entity.setTypeId(resourceTypeId);
		entity.setDescription(description);
		Resource resource = resourceService.save(entity);
		@SuppressWarnings("unchecked")
		Map<String, Resource> data = map("data", resource);
		return new ApiResult(HttpStatus.OK, data);
	}
	
	@DeleteMapping(value = "/resource/{id}")
	public ApiResult delete(String id){
		resourceService.delete(id);
		return new ApiResult(HttpStatus.OK, null);
	}
	
}
