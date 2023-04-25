package com.multilevel;

public class Customer extends Product {
	int id;
	String name;
	String address;
	 public void Customer(int id, String name, String address) {
		 System.out.println("cid:" +id);
		 System.out.println("cname:" +name);
		 System.out.println("caddress:" +address);
	 }
	 @Override
	public void product(int id, String name, double price) {
		// TODO Auto-generated method stub
		super.product(id, name, price);
	}
	 

}
