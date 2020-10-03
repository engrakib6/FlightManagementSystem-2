package com.trainee.schedulemodule.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UpdateAirportRequest {
	@NotBlank
	@Size(min=3)
	private String name;
	@NotBlank
	@Size(min=3)
	private String location;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setPassword(String location) {
		this.location = location;
	}

}
