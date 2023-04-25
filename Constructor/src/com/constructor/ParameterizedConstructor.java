package com.constructor;

public class ParameterizedConstructor {
	String  name;
	int id;
	double salary;
	String email;
	
	public ParameterizedConstructor(int id,String name,double ss,String eee) {
		this.id =id;
		this.name = name;
		salary = ss;
		email= eee;
		
	}
	
	public void person() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(email);
	}
	
	public static void main(String[] args) {
		ParameterizedConstructor m1=new ParameterizedConstructor(101,"Teena",30000.00,"badri@gmail.com");
		m1.person();
		ParameterizedConstructor m2=new ParameterizedConstructor(102,"Reena",40000.00,"reena@gmail.com");
		m2.person();
	}

}
