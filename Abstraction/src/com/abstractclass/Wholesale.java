package com.abstractclass;

public class Wholesale extends Clothing{
	
	public void nonfixedrate() {
		System.out.println("rate is not fixed");
	}

@Override
public void brand() {
	// TODO Auto-generated method stub
	System.out.println("cloths having brand names");
}
@Override
public void wash() {
	// TODO Auto-generated method stub
	System.out.println(" clothes are washable");
}
@Override
public void dry() {
	// TODO Auto-generated method stub
	System.out.println("we can dry clothes");
}
}
