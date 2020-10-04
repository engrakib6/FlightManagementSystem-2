package com.dxctraining.usermodule.controllers;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.dxctraining.usermodule.data_transfer.CreateUserRequest;
import com.dxctraining.usermodule.data_transfer.UpdateUserDetails;
import com.dxctraining.usermodule.entities.User;
import com.dxctraining.usermodule.services.IUserService;
import com.sun.istack.NotNull;
@Validated
@RequestMapping("/users")
@RestController
public class UserRestController {

	@Autowired
	private IUserService service;

	@PostMapping("/adduser")
	@ResponseStatus(HttpStatus.CREATED)
	public User addUser(@Valid @NotNull @RequestBody CreateUserRequest requestData) {
		String userType = requestData.getUserType();
		String userName = requestData.getUserName();
		String email = requestData.getEmail();
		String password = requestData.getPassword();
		Long phoneNumber = requestData.getPhoneNumber();
		User user = new User(userType, userName, email,password,phoneNumber);
		user= service.addUser(user);
		return user;
	}

	@GetMapping("/get/{id}")
	public User findUserById(@PathVariable("id") Integer userId) {
		User user = service.findUserById(userId);
		return user;
	}

	@GetMapping("/all")
	public List<User> allUsers() {
		List<User> list = service.listAllUsers();
		return list;

	}

	@PutMapping("/update")
	public User updateUser(@RequestBody UpdateUserDetails requestData) {
		Integer userId = requestData.getUserId();
		String userType = requestData.getUserType();
		String userName = requestData.getUserName();
		String password = requestData.getPassword();
		Long phoneNumber = requestData.getPhoneNumber();
		String email = requestData.getEmail();
		User user = new User(userType, userName,email, password, phoneNumber);
		user.setUserId(userId);
		user = service.updateUser(user);
		return user;
	}

	@DeleteMapping("/delete/{id}")
	public void DeleteUserById(@NotBlank @PathVariable("id") Integer userId) {
		service.deleteUser(userId);		
	}
}
