package com.shw.netdisk.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
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
    	Map data = map("items", pageResource);
    	return new ApiResult(HttpStatus.OK, data);
    }
	
	@ApiOperation(value = "查找资源", notes="根据关键字查找资源")
    @GetMapping(value = "/resources/search", params={"key"})
    public ApiResult search(
    		@ApiParam(value="查询的关键字")
    		@RequestParam(required = true, name="key") String key, 
    		@ApiParam(value = "偏移量")
    		@RequestParam(required = false, name="$offset") Integer offset, 
    		@ApiParam(value = "查询数量")
    		@RequestParam(required = false, name="$limit") Integer limit, 
    		@ApiParam(allowMultiple = true, value = "过滤条件，可以是name, type")
    		@RequestParam(required = false, name="filter") String filter){
    	List<Resource> resources = resourceService.findAll();
    	Map data = map("status", HttpStatus.OK, "items", resources);
    	return new ApiResult(HttpStatus.OK, data);
    }
	
	@GetMapping(value = "/save")
	public ApiResult save(String name){
		Resource entity = new Resource();
		entity.setId(1);
		entity.setName(name);
		entity.setDescription("description content");
		Resource resource = resourceService.save(entity);
		Map data = map("data", resource);
		return new ApiResult(HttpStatus.OK, data);
	}
	
	
	
}
