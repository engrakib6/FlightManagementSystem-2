package com.dxctraining.usermodule.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue
	private Integer userId;
	private String userType;
	private String userName;
	private String password;
	private Long phoneNumber;
	private String email;

	public User() {
	}

	public User(String userType, String userName, String email,String password,Long phoneNumber) {
		this.userType = userType;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.phoneNumber = phoneNumber;
		
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		return userId;
	}

	@Override
	public boolean equals(Object obj) {
		if(this==obj)return true;
		if(obj== null || getClass()!= obj.getClass()) {
		return false;
		}
		
		 User that = (User) obj;
		 return userId== that.userId;
	}

}
