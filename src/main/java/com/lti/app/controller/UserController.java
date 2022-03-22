package com.lti.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.app.pojo.User;
import com.lti.app.service.UserService;

@RestController
@RequestMapping("/rest/api")
@CrossOrigin("http://localhost:4200")
public class UserController {

	@Autowired
	UserService vService;
	
	@GetMapping("/user")
	public List<User> getUser()
	{
		return vService.validateUser();
	}
	
	@PostMapping("/user")
	public boolean addVehicle(@RequestBody User user)
	{
		return vService.addUser(user);
	}
	
	
	@GetMapping("/user/{username}/{password}")
	
	public boolean validateLogin(@PathVariable("username") String username,@PathVariable("password") String password)
	{
		return vService.validateLogin(username, password);
		
	}
	
	@GetMapping("/user/{title}/{username}/{password}")
	public boolean validateAdmin(@PathVariable("title") String title,@PathVariable("username") String username,@PathVariable("password") String password)
	{
		return vService.validateAdmin(title, username, password);
	}
	
	
}
