package com.abstrac;

public abstract class Animal {
	String name;
	public Animal(String name) {
		
		
		this. name=name;
	}
	
	abstract void eat();
	
	abstract void sleep();

	
	public String getName() {
		return this.name;
		
		
	}
	


}
