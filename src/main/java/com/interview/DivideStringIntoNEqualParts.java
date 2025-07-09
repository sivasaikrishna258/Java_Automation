package com.interview;

/**
 * here if the length of the string is not divisible by n then it will throw StringIndexOutOfBoundsException
 */
public class DivideStringIntoNEqualParts {

	public static int a=0;
	public static void main(String[] args) {

		String s="Sivasaikrish";
		
		int length=s.length(),n=3;
		int characters=length/n;
		int j=0;
		String temp[]=new String[n];

		for(int i=0;i<length;i=i+characters) {
			temp[j]  = s.substring(i, i+characters);
			
			j++;
		}
//		for(int k=0;k<temp.length;k++) {
//			System.out.println(temp[k]);
//		}
		
		for(String r:temp) {
			System.out.println(r);
		}


	}


	public void display(){
		System.out.println(a);
	}

}
