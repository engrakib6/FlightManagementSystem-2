package com.dxctraining.passenger.entities;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Passenger {
	@Id
	@GeneratedValue
	private BigInteger passengerNum;
	private String passengerName;
	private Integer passengerAge;
	private BigInteger passengerUIN;
	private double luggage;
	
	public Passenger(String passengerName,Integer passengerAge,BigInteger passengerUIN,double luggage) {
		this.passengerName=passengerName;
		this.passengerUIN=passengerUIN;
		this.passengerAge=passengerAge;
		this.luggage=luggage;
	}
	public Passenger() {
		
	}

	public BigInteger getPassengerNum() {
		return passengerNum;
	}

	public void setPassengerNum(BigInteger passengerNum) {
		this.passengerNum = passengerNum;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public Integer getPassengerAge() {
		return passengerAge;
	}

	public void setPassengerAge(Integer passengerAge) {
		this.passengerAge = passengerAge;
	}

	public BigInteger getPassengerUIN() {
		return passengerUIN;
	}

	public void setPassengerUIN(BigInteger passengerUIN) {
		this.passengerUIN = passengerUIN;
	}

	public double getLuggage() {
		return luggage;
	}

	public void setLuggage(double luggage) {
		this.luggage = luggage;
	}
	@Override
	public int hashCode() {
		int hash=passengerNum.hashCode();
		return hash;
	}
	@Override
	public boolean equals(Object arg) {
		if(arg==this) {
			return true;
		}
		
	   if(arg==null || !(arg instanceof Passenger) ) {
			return false;
	   }
		
	    Passenger that=(Passenger)arg;	
		boolean equalResult=this.passengerNum.equals(that.passengerNum);
		return equalResult;
	}

}
