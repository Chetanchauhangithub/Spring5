package com.springs;

import com.spring.Cars.Hyundai;
import com.spring.Cars.Swift;
import com.spring.interfaces.Car;

public class App {

	public static void main(String[] args) {
		
		
		Car swift=new Swift();
		Car hyundai = new Hyundai();
		
		System.out.println(swift.specs());
		System.out.println(hyundai.specs());

	}

}
