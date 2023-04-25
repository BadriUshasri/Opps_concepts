package com.Interface;

public class NetworkTest {
public static void main(String[] args) {
	
	Network airtel = new Airtel();
	airtel.callrate();
	airtel.smsrate();
	airtel.datarate();
	
	Network jio = new Jio();
	jio.callrate();
	jio.smsrate();
	jio.datarate();
}
}
