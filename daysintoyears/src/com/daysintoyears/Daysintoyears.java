package com.daysintoyears;

public class Daysintoyears {
	public static void main(String[] args)
    {
        int days = 2000;
        int years;
        int weeks;

       
        years = (days/ 365);
        weeks = (days % 365) / 7;
        days = days - ((years * 365) + (weeks));

       
        System.out.println("\n" + years + " Years, " + weeks + " Weeks, and " + days + " Days\n");
    }
}

