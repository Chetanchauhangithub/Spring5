package com.springs.Cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springs.interfaces.Car;

@Component("swift")
public class Swift implements Car {

	//@Autowired(required=false)
	Engine engine;
	
	
	@Autowired(required=false)
	public void setEngine(Engine engine) {
		engine.type = "New Engine v8";
		this.engine = engine;
	}
	
	


	
	public Swift(Engine engine) {
		super();
		this.engine = engine;
	}





	public String specs() {
		
		//String spec="Baleno from suzuki "+engine.type;
		String spec="Baleno from suzuki unknown";
		
		return spec;
	}

}
