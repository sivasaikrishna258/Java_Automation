package com.interview;

public class PrimeNumberProgram {

	public static void main(String[] args) {

		int n=123,flag=0;
		int m=n/2;
		System.out.println(m);
		 if(n==0||n==1) {
			 System.out.println("not prime");
		 }
		 else {
			 for(int i=2;i<=m;i++) {
				 if(n%i==0) {
					 System.out.println(n+" "+ "is not prime number");
					 flag=1;
					 break;
					 
				 }
				 
			 }
			 if(flag==0) {
				 System.out.println(n+" is prime number");
			 }
		 }
	}

}
