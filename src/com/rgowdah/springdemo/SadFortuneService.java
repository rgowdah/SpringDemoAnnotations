package com.rgowdah.springdemo;

public class SadFortuneService implements FortuneService {
	@Override
	public String getFortune() {
		return "Today is Sad Day";
	}
}
