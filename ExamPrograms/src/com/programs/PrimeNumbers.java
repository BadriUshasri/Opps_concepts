package com.programs;

public class PrimeNumbers {
//	public static void main(String[] args) {
//	int n=71;
//		int m = 0;
//		for(int i=1;i<=n;i++) {
//			if (n%i==0) {
//				m++;
//			}
//			
//			
//		}
//		if(m==2) {
//			System.out.println("prime");
//		}else {
//				System.out.println("not prime");
//			}		 
//	//table
//		int b = 7;
//		for(int i =1; i<=10;i++) {
//			System.out.println(b+"*"+i+"="+b*i);
//	}
//		
//		
////		
////		//even
//		int num = 4;
////		for(int i=0;i<=num;i++) {
//			if(num%2==0) {
//			System.out.println("even");			
//			}
//			else {
//				System.out.println("odd");
//			}
//		}
//	
//		
//		//121
//		
//		int i=121;
//		int sum=0;
//		int remainder;
//		int temp= i ;
//		while(i!=0) {
//			//121%10=1;12%10=2;1%10=1
//			remainder=i%10;
////			(0*10)+1=1;(1*10)+2=12;(12*10)+1=121
//			sum=(sum*10)+remainder;
////			121/10=12;12/10=1;1/10
//			i=i/10;
//			
//			
//		}
//		if(sum==temp) {
//			System.out.println("palindrome");
//		}else {
//			System.out.println("not");
//		}
//	fibonacci series	
		
//		int n1=0,n2=1,n3,i1,count=10;    
//		 System.out.print(n1+" "+n2);//printing 0 and 1    
//		    
//		 for(i1=2;i1<count;++i1)//loop starts from 2 because 0 and 1 are already printed    
//		 {    
//		  n3=n1+n2;    
//		  System.out.print(" "+n3);    
//		  n1=n2;    
//		  n2=n3;    
//		 }    
//		
		
		
//		 Recursion
		
		
		public static int factorial(int a) {
	

		if(a!=0) {
			return a*factorial(a-1);
		}else {
			return 1;
			}
		}
		public static void main(String[] args) {
			System.out.println(factorial(6));
		}
		
			
			
			
			
			
			
			
		
		
		
	
		
		
	}




