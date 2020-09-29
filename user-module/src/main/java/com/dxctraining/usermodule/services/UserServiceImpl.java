package com.dxctraining.usermodule.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dxctraining.usermodule.dao.IUserDao;
import com.dxctraining.usermodule.entities.User;
import com.dxctraining.usermodule.exceptions.InvalidArgumentException;

@Service
@Transactional
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDao dao;

	@Override
	public User addUser(User user) {
		validate(user);
		return dao.addUser(user);
	}

	@Override
	public User findUserById(Integer userId) {
		validate(userId);
		return dao.findUserById(userId);
	}

	@Override
	public List<User> listAllUsers() {
		return dao.listAllUsers();
	}

	@Override
	public User updateUser(User user) {
		return dao.updateUser(user);
	}

	@Override
	public void deleteUser(Integer userId) {
		validate(userId);
		dao.deleteUser(userId);
	}
	
	private void validate(Object obj) {
		if (obj == null) {
			throw new InvalidArgumentException("given argument is null");
		}
	}
}
