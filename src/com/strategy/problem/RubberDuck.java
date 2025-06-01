package com.strategy.problem;


// Rubber duck forced to implement the method which is not applicable to it
// DESIGN principle #1: Encapsulate what varies and isolate it from the what stays 
// same.
public class RubberDuck extends Duck {

	@Override
	public void fly() {
		// This method is not needed here as rubber duck does not fly
		// TODO Auto-generated method stub
		
	}

	@Override
	public void quack() {
		// Rubber duck makes a sound different than quack
		// TODO Auto-generated method stub
		
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

}
