package com.sortbyuserdefinedmethod;

public class SortbyUserDefinedMethod {
	public static void main(String[] args)   
	{          
	int i;  
	//initializing an array  
	int array[] = {18, 43, 11, -9, 0, 7, 65, 33, 90, -25, 58, 21};  
	System.out.print("Array elements before sorting: ");  
	for(i = 0; i < array.length; i++)  
	System.out.print(array[i]);        
	//invoking user defined method           
	sortArray(array, array.length);  
	System.out.print("Array elements after sorting:  ");      
	//accessing elements of the sorted array     
	for(i = 0; i <array.length; i++)  
	{  
	System.out.print(array[i]);  
	}  
	}  
	//user defined method to sort an array in ascending order  
	private static void sortArray(int array[], int n)   
	{  
	for (int i = 1; i < n; i++)  
	{  
	int j = i;  
	int a = array[i];  
	while ((j > 0) && (array[j-1] > a))   //returns true when both conditions are true  
	{  
	array[j] = array[j-1];  
	j--;  
	}  
	array[j] = a;  
	}  
	}  
	}  

