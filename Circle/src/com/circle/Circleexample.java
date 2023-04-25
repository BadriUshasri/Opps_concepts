package com.circle;

public class Circleexample {
private void area() {
	float radius = 10;
	float diameter = (2*radius);
	float circumference = (float)(2*3.14*radius);
	float area = (float)(3.14*radius*radius);
	System.out.println("area of circle:"+area);
}
private void diameter() {
	float radius = 10;
	float diameter = (2*radius);
	System.out.println("diameter of circle:"+diameter);
}
private void circumference() {
	float radius=10;
	float diameter =(2*radius);
	float circumference = (float)(2*3.14*radius);
	System.out.println("circumference of circle:" +circumference);
}
		 public static void main(String[] args) {
			 Circleexample circle = new Circleexample();
			 circle.area();
			 circle.diameter();
			 circle.circumference();
			 
			 
			 
		 }
			
}

