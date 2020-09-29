package com.dxctraining.usermodule.dao;

import java.util.List;

import javax.persistence.*;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import com.dxctraining.usermodule.entities.User;
import com.dxctraining.usermodule.exceptions.UserNotFoundException;

@Repository
@Service
public class UserDaoImpl implements IUserDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public User addUser(User user) {
		entityManager.persist(user);
		return user;
	}

	@Override
	public User findUserById(Integer userId) {
		User user = entityManager.find(User.class, userId);
		if (user == null) {
			throw new UserNotFoundException("user not found for id" + userId);
		}
		return user;
	}

	@Override
	public List<User> listAllUsers() {
		String jpaquery = "from User";
		TypedQuery<User> query = entityManager.createQuery(jpaquery, User.class);
		List<User> userList = query.getResultList();
		return userList;
	}

	@Override
	public User updateUser(User user) {
		entityManager.merge(user);
		return user;
	}

	@Override
	public void deleteUser(Integer userId) {
		User user=findUserById(userId);
		entityManager.remove(user);
	}

}
