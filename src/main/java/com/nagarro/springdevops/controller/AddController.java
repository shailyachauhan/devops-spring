package com.nagarro.springdevops.controller;

import java.util.List;

import com.nagarro.springdevops.entity.AddUser;
import com.nagarro.springdevops.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddController {
	@Autowired
	private UserService service;
	@PostMapping("/user")
	public AddUser addUser(@RequestBody AddUser user)
	{
		return service.addUser(user);
	}
	@GetMapping("/users")
	public List<AddUser> getAllUser()
	{
		return service.getAllUser();
	}
	@GetMapping("/user/{id}")
	public  AddUser getUserById(@PathVariable("id") Long id)
	{
		return service.getUserById(id);
	}

}
