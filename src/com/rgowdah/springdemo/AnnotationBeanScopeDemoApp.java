package com.rgowdah.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
	public static void main(String[] args) {
		//load spring configuration file
		ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach coach=applicationContext.getBean("tennisCoach",Coach.class);
		Coach alphaCoach=applicationContext.getBean("tennisCoach",Coach.class);
		
		//check if they are same
		boolean result= (coach==alphaCoach);
			
		//print out the results
		System.out.println("Pointing to the same object: "+result);
		System.out.println("Memory location for coach: "+ coach);
		System.out.println("Memory location for alpha coach: "+alphaCoach);
		//close the configuration file
		applicationContext.close();
	}

}
