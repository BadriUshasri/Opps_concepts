package com.centimetersintokilometer;

public class centimeterintokilometer {
	public static void main (String[] args)
    {
        double cm, meter, kilometer;
        cm = 100000;
     
        // Converting centimeter
        // into meter and kilometer
        meter = cm / 100.0;
        kilometer = cm / 100000.0;
     
        System.out.println("Length in meter = " +
                                    meter + "m");
         
     
        System.out.println("Length in Kilometer = " +
                                   kilometer + "km");
    }
}

