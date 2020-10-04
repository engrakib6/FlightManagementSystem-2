package com.dxctraining.usermodule.dao;

import java.util.List;

import com.dxctraining.usermodule.entities.User;

public interface IUserDao {

	User addUser(User user);

	User findUserById(Integer userId);

	List<User> listAllUsers();

	User updateUser(User user);

	void deleteUser(Integer userId);

}
