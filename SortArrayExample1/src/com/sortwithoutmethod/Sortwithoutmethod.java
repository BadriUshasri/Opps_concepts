package com.sortwithoutmethod;
public class Sortwithoutmethod {
 public static void main(String[] args) {
	 int[] arr = new int[] {8, 34, 11, 3, 70, 48, -11, -45, 6, 55, 20, -69,-80,50};  
	 System.out.println("Array elements after sorting:");  
	 for (int i = 0; i < arr.length; i++)   
	 {  
	 for (int j = i + 1; j < arr.length; j++)   
	 {  
	 int tmp = 0;  
	 if (arr[i] > arr[j])   
	 {  
	 tmp = arr[i];  
	 arr[i] = arr[j];  
	 arr[j] = tmp;  
	 }  
	 }  
	 
	 System.out.println(arr[i]);  
	 }  
	 }  
	  
}
