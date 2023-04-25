package com.constructor;

public class ConstructorOverloading {

	int id;
	String firstname;
	String lastname;
	static String address="Mancherial";
	static long phonenum =93938495;
	
	static {
		System.out.println("address:" +address);
	}
	
	public String getlastName(String lastname) {
		return this.lastname=lastname;
		
	}
	public void displayconstructor() {
		System.out.println("customer id:" +id);
		System.out.println("customer firstname:" +firstname);
		System.out.println("customer lastname:" +lastname);
		System.out.println("customer address:" +address);
		System.out.println("customer phonenum:" +phonenum);
	}
	
	
	public static void main(String[] args) {
		ConstructorOverloading details = new ConstructorOverloading();
		details.id = 888;
		details.firstname= "Badri";
//		details.lastname="Teena";
		System.out.println(details.getlastName("Teena"));
		details.displayconstructor();
	}
	
}
