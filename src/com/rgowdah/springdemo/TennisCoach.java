package com.rgowdah.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
	//Field Injection
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	//constructor injection
	/*@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}*/

	//define default constructor
	public TennisCoach(){System.out.println("Inside default constructor");}

	//method injection
	/*@Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		System.out.println("Inside doSomeCrazyStuff method");
		this.fortuneService = fortuneService;
	}*/

	/*//setter injection
	@Autowired
	public void setFortuneService(FortuneService thefortuneService) {
		System.out.println("Inside setFortuneService method");
		this.fortuneService = thefortuneService;
	}*/
	//define init method
	@PostConstruct
	public void doMyStartupStuff(){
		System.out.println("Inside of doMyStartupStuff method");
	}

	//define destroy method
	@PreDestroy
	public void doMyCleanupStuff(){
		System.out.println("Inside of doMyCleanupStuff method");
	}
	@Override
	public String getDailyWorkout() {
		return "Practice your backend volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}


}
