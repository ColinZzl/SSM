package com.ssm.dao;


import com.ssm.domain.User;

import javax.annotation.Resource;


@Resource
public interface IUserDao {
	
	public User getUserById(int id); 

}
