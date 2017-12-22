package com.rgowdah.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		//read spring configuration file
		AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(SportConfig.class);
		//get the bean from spring container
		Coach coach=applicationContext.getBean("tennisCoach",Coach.class);
		//call the method from bean
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		//close the context
		applicationContext.close();
	}
}
