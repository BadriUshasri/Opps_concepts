package com.array2d;

public class Array2D {
public static void main(String[] args) {
	int[][] arr = new int [3][3];
	arr[0][0] = 50;
	arr[0][1] = 60;
	arr[0][2]= 90;
	arr[1][0]= 30;
	arr[1][1] = 70;
	arr[1][2] = 80;
	arr[2][0] =100;
	arr[2][1]=40;
	arr[2][2] = 20;
	for(int i =0;i<3;i++) {
	for(int j = 0;j<3;j++) {
	
	
	System.out.print(arr[i][j]+ " ");
	}
	System.out.println(" ");
	}
	
	
}
}
