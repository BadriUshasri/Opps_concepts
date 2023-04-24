package com.abstractclass;

public class Testing {
public static void main(String[] args) {
	
	Wholesale w = new Wholesale();
	w.brand();
	w.dry();
	w.wash();
	w.nonfixedrate();
	Retail r = new Retail();
	r.fixedrate();
	
}
}
