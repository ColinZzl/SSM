package com.ssm.dao;

import org.springframework.stereotype.Component;

import com.ssm.domain.User;


@Component
public interface IUserDao {
	
	public User getUserById(int id); 

}
