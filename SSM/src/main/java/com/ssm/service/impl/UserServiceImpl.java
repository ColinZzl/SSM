package com.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ssm.dao.IUserDao;
import com.ssm.domain.User;
import com.ssm.service.IUserService;

@Component("IUserService")  
public class UserServiceImpl implements IUserService {
	
	@Autowired
    private IUserDao userDao;
	
	public User getUserById(int userId) {
        return this.userDao.getUserById(userId);  
	}

}
