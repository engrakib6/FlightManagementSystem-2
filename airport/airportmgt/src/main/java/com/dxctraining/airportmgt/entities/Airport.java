package com.dxctraining.airportmgt.entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 
 * @author rpalaparthi
 *
 **/

@Entity
public class Airport {

	@Id
	private String code;
	private String name;
	private String location;

	public Airport(String code, String name, String location) {
		this.code = code;
		this.name = name;
		this.location = location;
	}

	public Airport(String name, String location) {

		this.name = name;
		this.location = location;
	}

	public Airport() {

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

	public void setPassword(String location) {
		this.location = location;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Airport airport = (Airport) o;
		return Objects.equals(code, airport.code);
	}

	@Override
	public int hashCode() {
		return Objects.hash(code);
	}

}
