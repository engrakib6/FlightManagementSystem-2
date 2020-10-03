package com.dxctraining.airportmgt.dto;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class CreateAirportRequest {
	@NotBlank
	@Size(min = 3)
	private String name;
	@NotBlank
	@Size(min = 3)
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

	public void setLocation(String location) {
		this.location = location;
	}

}
