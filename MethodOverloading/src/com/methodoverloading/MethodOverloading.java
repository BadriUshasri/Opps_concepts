package com.methodoverloading;

public class MethodOverloading {

	
    int id;
    String name;
    double Salary;
    
    public void m1(int id) {
    	System.out.println(id);
    }
    
    public void m1(int id,String name) {
    	System.out.println(id);
    	System.out.println(name);
    }
    
    public void m1(int id,String name,double salary) {
    	System.out.print( id );
    	System.out.print( name );
    	System.out.print( salary );
    }
    
    public static void main(String[] args) {
		MethodOverloading method = new MethodOverloading();
		method.m1(101);
		method.m1(102, "Teena");
		method.m1(103, "Teena", 30000.00);
	}
}
