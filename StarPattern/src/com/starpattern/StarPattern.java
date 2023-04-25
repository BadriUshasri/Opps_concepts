package com.starpattern;

public class StarPattern {
 public static void main(String[] args) {
	int size = 5;
	for(int i = 0; i<size;i++) {
		for(int j = 0; j<size;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	for(int i=0; i<=size;i++) {
		for(int j = 0; j<i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	
	for(int i=0;i<=size;i++) {
		for(int j=0;j<size-i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
//	for(int i=0;i<=size;i++) {
//		for(int j =0;j<=size;j++) {
//			if(i==0||i==size-1) {
//			System.out.print("*");
//			}else if(j==0||j==size-1) {
//				System.out.print("*");
//			}
//			else {
//				System.out.println();
//			}
//			
//				System.out.println();
//			}
//		}
	}
}

