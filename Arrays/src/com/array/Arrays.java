package com.array;

public class Arrays {
 public static void main(String[] args) {
	int [] numbers = new int[7];
	numbers[0] = 1;
	numbers[1] = 2;
	numbers[2] = 3;
	numbers[3] = 4;
	numbers[4] = 5;
//	System.out.println(numbers[0]);
//	System.out.println(numbers[1]);
//	System.out.println(numbers[2]);
//	System.out.println(numbers[3]);
//	System.out.println(numbers[4]);
//	System.out.println(numbers[5]);
//	for (int i = 0;i<7;i++) {
//		System.out.print(numbers[i]+",");
		for (int i1 = 0; i1<numbers.length;i1++) {
			System.out.print(numbers[i1]+" ");
		}
	}
}

