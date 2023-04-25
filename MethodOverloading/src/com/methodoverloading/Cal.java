package com.methodoverloading;

public class Cal {

	public int sum(int a , int b) {
		return a+b;
		
	}
	public double sum(double a , double b) {
		return a+b;
	}
	
	public float sum(float a , float b) {
		return a+b;
	}
	public long sum(long a , long b) {
		return a+b;
	}
	public static void main(String[] args) {
		Cal cal = new Cal();
	 System.out.println (cal.sum(3,7));
	 System.out.println(cal.sum(12.0,30.0));
	 System.out.println(cal.sum(3.4,4.6 ));
	 System.out.println(cal.sum(12000000l, 3000000l));
	}
}
