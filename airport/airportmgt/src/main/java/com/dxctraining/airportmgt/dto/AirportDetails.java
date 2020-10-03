package com.dxctraining.airportmgt.dto;

public class AirportDetails {

	private String code;

	private String name;

	private String location;

	public AirportDetails() {

	}

	public AirportDetails(String code, String name, String location) {
		this.code = code;
		this.name = name;
		this.location = location;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

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
