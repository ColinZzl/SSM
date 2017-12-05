package com.ssm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssm.domain.User;
import com.ssm.service.IUserService;

@RestController
public class UserController {
	@Autowired
	private IUserService iUserService;
	
	  @RequestMapping("user/showUser")  
	    public User getUser(HttpServletRequest request){  
	        int userId = Integer.parseInt(request.getParameter("id"));  
	        User user = iUserService.getUserById(userId);  
	        return user;  
	  }
}
