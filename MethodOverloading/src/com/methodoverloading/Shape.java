package com.methodoverloading;

public class Shape {
	public void area(double ar) {
		double formulaOfArea = ar*ar*ar*ar;
//	    final double area = Math.pow(ar,4);
//	     System.out.println("area of square:"   +area);
	    System.out.println("area of square:"   +formulaOfArea);
	}
	public double area(double length, double width) {
		double areaOfRectangle = length*width;
		return areaOfRectangle;
	
	}
    public double area(float radius) {
		double area = Math.PI*(radius*radius);
		return area;
	}
     public float area(float base, float height) {
     float area = 1/2*(height*base);
     return area;
     }
     public static void main(String[] args) {
		Shape Square = new Shape();
		Square.area(6);
		Shape Rectangle = new Shape();
		Rectangle.area(10, 30);
		Shape Circle = new Shape();
		Circle.area(40.0f);
		Shape Triangle = new Shape();
		Triangle.area(20.f,40.f);
	}
     
    
}
