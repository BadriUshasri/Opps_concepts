package com.abstrac;

public abstract class Bird extends Animal {
	
	public Bird(String name) {
		super (name);
		
		
	}
	 @Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println(getName()+ "feeding.....");
	}
      
@Override
void sleep() {
	// TODO Auto-generated method stub
	System.out.println(getName()+ "resting.....");
}	 
 abstract void fly();
	 
	 
	

}
