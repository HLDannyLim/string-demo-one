package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		//Load the spring configuration file 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//Retrieve bean from spring container 
		Coach theCoach = context.getBean("myCoach", Coach.class);
		//Call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		//Call the new method from fortunes
		System.out.println(theCoach.getDailyFortune());
		
		//Close the context
		context.close();
	}

}
