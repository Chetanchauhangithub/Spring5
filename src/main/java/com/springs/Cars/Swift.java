package com.springs.Cars;

import org.springframework.stereotype.Component;

import com.springs.interfaces.Car;

@Component("swift")
public class Swift implements Car {

	@Override
	public String specs() {
		
		
		return "Baleno from suzuki";
	}

}
