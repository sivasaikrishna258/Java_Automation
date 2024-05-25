package com.interview;

public class DivideStringIntoNEqualParts {

	public static void main(String[] args) {

		String s="Sivasairkish";
		
		int length=s.length(),n=3;
		int characters=length/n;
		int j=0;
		String temp[]=new String[n];
		
		
		System.out.println(length +" "+characters);
		
		for(int i=0;i<length;i=i+characters) {
			temp[j]  =s.substring(i, i+characters);
			
			j++;
		}
//		for(int k=0;k<temp.length;k++) {
//			System.out.println(temp[k]);
//		}
		
		for(String r:temp) {
			System.out.println(r);
		}
	}

}
