package com.Interface;

public class Airtel implements Network {
	
	
	@Override
	public void callrate() {
		// TODO Auto-generated method stub
		System.out.println("airtel callrate:" + "1.5p/sec");
	}
	@Override
	public void smsrate() {
		// TODO Auto-generated method stub
		System.out.println("airtel smsrate:" + "1.0p/sec");
	}
	
     @Override
    public void datarate() {
    	 System.out.println("airtel datarate:" + "1.2p/sec");
    	 }
}
