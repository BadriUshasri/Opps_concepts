package com.abstrac;

public class Penguin extends Bird {
	
	public Penguin(String name) {
		super(name);
		
	}
	@Override
	void fly() {
		// TODO Auto-generated method stub
		System.out.println(getName()+  "Flying....");
	}
	
	public static void main(String[] args) {
		Penguin pp = new Penguin("parrot");
		pp.eat();
		pp.fly();
		pp.sleep();
	}
 
}

