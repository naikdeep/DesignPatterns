package com.strategy.solution;


// Code for interface and segregate what varies into interfaces
public class Duck {
	
	//Form the HAS-A relationship and set  the behavior dynamically.
	 FlyBehavior chooseBehavior;
	 
     public void swim() {
    	 System.out.println("Every ducks swims, even rubber and decoy too");
     }
     
     public void display() {
    	 System.out.println("Every ducks are displayable");
     }
     
     public void setFlyBehavior(FlyBehavior fly) {
    	 fly.fly();
     }
}
