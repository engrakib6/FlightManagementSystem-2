package com.dxctraining.fms.dto;

import java.math.BigInteger;

public class FlightDto {
	private BigInteger flightNum;
	private String flightModel;
	private String carrierName;
	private int seatCapacity;

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

}
