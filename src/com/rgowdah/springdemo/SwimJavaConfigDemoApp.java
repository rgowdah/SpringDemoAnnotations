package com.rgowdah.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {
	
	public static void main(String[] args) {
		//read spring configuration file
		AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(SportConfig.class);
		//get the bean from spring container
		SwimCoach coach=applicationContext.getBean("swimCoach",SwimCoach.class);
		//call the method from bean
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		//values injected
		System.out.println("email:"+coach.getEmail());
		System.out.println("Team:"+coach.getTeam());
		//close the context
		applicationContext.close();
	}

}
