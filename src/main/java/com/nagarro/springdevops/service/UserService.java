package com.nagarro.springdevops.service;

import java.util.List;

import com.nagarro.springdevops.entity.AddUser;
import com.nagarro.springdevops.repository.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private UserRepo repo;
	
	public AddUser addUser(AddUser user) {
		return repo.save(user);
		
	}
	public List<AddUser> getAllUser() {
		return repo.findAll();
		
	}
	public AddUser getUserById(Long id) {
		return repo.findById(id).orElse(null);
		
	}

}
