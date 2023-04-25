package com.Interface;

public class Jio implements Network{
	
	
	@Override
	public void callrate() {
		// TODO Auto-generated method stub
	 System.out.println("jio callrate:" + "1.2p/sec");
	}
	@Override
	public void smsrate() {
		// TODO Auto-generated method stub
		System.out.println("jio smsrate:" +  "1.5p/sec");
	}
	@Override
	public void datarate() {
		// TODO Auto-generated method stub
		System.out.println("jio datarate:" +"1.2p/sec");
	}

}
