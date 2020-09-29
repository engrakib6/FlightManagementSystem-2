package com.dxctraining.flight.entities;
import java.math.BigInteger;

import javax.persistence.*;


@Entity
@Table(name = "flights")

public class Flight {
	@Id
	@GeneratedValue
	private BigInteger flightNum;
	private String flightModel;
	private String carrierName;
	private int seatCapacity;
	
	public Flight(String flightModel,String carrierName,int seatCapacity) {
		this.flightModel=flightModel;
		this.carrierName=carrierName;
		this.seatCapacity=seatCapacity;
	}
	public Flight() {
		
	}

	
	public BigInteger getFlightNum() {
		return flightNum;
	}
	public void setFlightNum(BigInteger flightNum) {
		this.flightNum = flightNum;
	}
	public String getFlightModel() {
		return flightModel;
	}

	public void setFlightModel(String flightModel) {
		this.flightModel = flightModel;
	}

	public String getCarrierName() {
		return carrierName;
	}

	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}

	public int getSeatCapacity() {
		return seatCapacity;
	}

	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}
	@Override
	public int hashCode() {
		int hash=flightNum.hashCode();
		return hash;
	}
	@Override
	public boolean equals(Object arg) {
		if(arg==this) {
			return true;
		}
		
	   if(arg==null || !(arg instanceof Flight) ) {
			return false;
	   }
		
	    Flight that=(Flight)arg;	
		boolean equalResult=this.flightNum.equals(that.flightNum);
		return equalResult;
	}
}
