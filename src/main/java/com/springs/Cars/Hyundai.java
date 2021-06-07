package com.springs.Cars;

import org.springframework.stereotype.Component;

import com.springs.interfaces.Car;


@Component("hyundai")
public class Hyundai implements Car{

	@Override
	public String specs() {
		
		return "i20 from Hyundai";
	}

	
	
}
