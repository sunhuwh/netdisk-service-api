package com.shw.netdisk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shw.netdisk.entity.Resource;
import com.shw.netdisk.service.ResourceService;

@Controller
public class ResourceController implements ControllerHelper{
	
	@Autowired
    private ResourceService resourceService;
    
    @RequestMapping("/resources")
    @ResponseBody
    public List<Resource> findAll(){
    	return resourceService.findAll();
    }
	
}
