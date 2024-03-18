package com.jspiders.springrest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspiders.springrest.pojo.AdminPOJO;
import com.jspiders.springrest.repository.AdminRepository;

@Service
public class AdminService {
	
	@Autowired
	private AdminRepository repository;

	public AdminPOJO addAdmin(AdminPOJO admin) {
		AdminPOJO pojo = repository.addAdmin(admin);
		return pojo;
	}

	public AdminPOJO login(String username, String password) {
	AdminPOJO admin  =	repository.login(username,password);
		return admin;
	}
	

}
