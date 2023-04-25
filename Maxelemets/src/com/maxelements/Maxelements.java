package com.maxelements;

public class Maxelements {
 public static void main(String[] args) {
	int [] arr= {4,8,11,88,7,90,45};
	int max = arr[0];
	for(int i = 0;i<=arr.length;i++) {
		if(max<arr[i]) {
			max=arr[i];
		
		System.out.println("max number present in given array:" + max);
	}
	
	}
}
}
