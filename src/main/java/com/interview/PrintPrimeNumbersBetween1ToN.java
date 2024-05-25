package com.interview;

public class PrintPrimeNumbersBetween1ToN {

	public static void main(String[] args) {

		
		
		for(int i =1;i<=10;i++) {
			int flag = 0;

			
			if(i<=1) {
				System.out.println(i+"not prime");
			}else {
			for(int j=2;j<=i/2;j++) {
	
			if(i%j==0) {
				System.out.println(i+"not prime");

				flag=1;
				break;
			}
		}
			if(flag==0) {
				System.out.println(i+"is prime ");
			}
			}
		}

	}

}
