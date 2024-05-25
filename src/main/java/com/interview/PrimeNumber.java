package com.interview;

public class PrimeNumber {

	public static void main(String[] args) {

		int a[]= {45,65,67,78};
		
		
		for(int n:a){
			int flag=0;

			if(n==0 || n==1) {
				System.out.println(n +"number is not prime");
				break;
			}
			else {
				for(int j=2;j<=n/2;j++) {
					/**here we iterate till n/2 beacuse if we make factors the second highest factor is n/2 for even numbers 
					 * but for odd is is less than n/2
					 * eg : int n=16 . factors =4*4 ,2*8,
					 */
					if(n%j==0) {
						System.out.println(n+"is not prime");
						flag=1;
						break;
					}
				}
				if(flag==0) {
					System.out.println(n+"is prime number");
					
				}
			}
		}
	}

}
