package com.springs;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springs.Cars.Hyundai;
import com.springs.Cars.Swift;
import com.springs.interfaces.Car;

public class App {

	public static void main(String[] args) {
		
		
		Car swift=new Swift();
		Car hyundai = new Hyundai();
		
		//System.out.println(swift.specs());
		//System.out.println(hyundai.specs());
		
		
		AnnotationConfigApplicationContext context =
			new	AnnotationConfigApplicationContext(AppConfig.class);
		
		Car myCar = context.getBean("swift",Car.class);
		System.out.println(myCar.specs());
		context.close();
		

	}

}
