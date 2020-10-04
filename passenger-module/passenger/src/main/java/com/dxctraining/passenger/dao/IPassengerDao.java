package com.dxctraining.passenger.dao;

import java.math.BigInteger;
import org.springframework.data.jpa.repository.JpaRepository;

import com.dxctraining.passenger.entities.Passenger;

public interface IPassengerDao extends JpaRepository<Passenger, BigInteger> {
}
