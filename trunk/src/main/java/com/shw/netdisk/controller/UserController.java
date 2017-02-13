package com.shw.netdisk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shw.netdisk.domain.User;
import com.shw.netdisk.service.UserService;

@Controller
public class UserController implements ControllerHelper{
	
	@Autowired
    private UserService userService;
    
    @RequestMapping("/users")
    @ResponseBody
    public List<User> findAll(){
    	List<User> users = userService.findAll();
    	return users;
    }
	
}
