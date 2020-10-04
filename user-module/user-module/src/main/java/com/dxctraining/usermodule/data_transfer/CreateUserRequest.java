package com.dxctraining.usermodule.data_transfer;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class CreateUserRequest {
	@NotBlank
	@Size(min=4)
	@Size(max=5)
	private String userType;
	
	@NotBlank
	@Size(max=20)
	private String userName;
	@NotBlank
	private String email;
	@NotBlank
	@Size(min=5)
	private String password;

	private Long phoneNumber;

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
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
}
