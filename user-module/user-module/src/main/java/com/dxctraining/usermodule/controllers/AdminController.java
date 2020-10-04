package com.dxctraining.usermodule.controllers;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxctraining.usermodule.entities.User;
import com.dxctraining.usermodule.services.IUserService;

@RestController
@RequestMapping("/admin/users")
public class AdminController {

	private static final Logger Log = LoggerFactory.getLogger(AdminController.class);

	    @Autowired
	    private IUserService service;


	    @GetMapping
	    public List<User> listAllUser() {
	        List<User> users = service.listAllUsers();
	       return users;
	    }
}
