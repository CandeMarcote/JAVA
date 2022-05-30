package com.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "If someone tries to ruin your day, tell them to f off. It's your day, ruin it yourself...";
	}
}
