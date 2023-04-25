package com.sortarrayexample1;

import java.util.Arrays;

public class SortArrayExample1 {
public static void main(String[] args) {
	int[]array = new int[] {5,13,8,45,11,96,16,98};
	Arrays.sort(array);
	System.out.println("Elements of array sorted in ascending order:");
	for(int i = 0;i<array.length;i++)
	{
		System.out.println(array[i]);
	}
}
}
