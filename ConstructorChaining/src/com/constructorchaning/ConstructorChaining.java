package com.constructorchaning;

public class ConstructorChaining {
	int x;
	int y;
	
	public ConstructorChaining() {
		System.out.println("default constructor");
	}
	
	public ConstructorChaining(int x) {
		System.out.println("parameterized constructor with x");
		this.x = x;
		}
	public ConstructorChaining(int x,int y) {
		System.out.println("parameterized constructor with x and y");
		this.x=x;
		this.y=y;
		}
	public static void main(String[] args) {
		ConstructorChaining cc = new ConstructorChaining();
		cc.x = 10;
		cc.y = 20;
		System.out.println(cc.x + "      " +cc.y);
		ConstructorChaining cc1 = new ConstructorChaining(10);
		System.out.println(cc1.x);
		ConstructorChaining cc2 = new ConstructorChaining(100,200);
		System.out.println(cc2.x + "      " +cc2.y );
		
		
	}

}
