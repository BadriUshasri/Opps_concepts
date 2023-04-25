package com.blocks;

public class Blocks {

	
		static {
			System.out.println("Static block");
		}
		
		{
			System.out.println("instanceblock");
		}
		public static void main(String[] args) {
			Blocks blocks= new Blocks();
		}
	
}
