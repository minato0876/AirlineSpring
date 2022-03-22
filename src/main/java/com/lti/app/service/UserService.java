package com.lti.app.service;

import java.util.List;

import com.lti.app.pojo.User;

public interface UserService {

	public List<User> validateUser();
	public List<User> validateAdmin();
	public boolean addUser(User user);
	public boolean validateLogin(String username,String password);
	public boolean validateAdmin(String title,String username,String password);
}