package com.interview;

public class ConvertingLowecaseToUppercase {

	public static void main(String[] args) {

		String s="SioCskan";
		char[] c=s.toCharArray();
		char[] c1=s.toCharArray();
		for(int i=0;i<s.length();i++) {
//			if(s.charAt(i)>='a' && s.charAt(i)<='z') {
//
//				c[i]=(char)(c[i]-32);
//			}


			if(s.charAt(i)>='A' && s.charAt(i)<='Z') {

				c1[i]=(char)(c1[i]+32);
			}


		}

//		s=new String(c);
//		String s1 = new String(c1);
//		System.out.println(s);
//		System.out.println(s1);
		for(int i=0;i<s.length();i++) {
			System.out.println(c1[i]);
		}
		
		String s3=new String(c1);
		System.out.println(s3);
		char c3[]=s3.toCharArray();
		
		for(int i=0;i<c3.length;i++) {
			int count=1;
			for(int j=i+1;j<c3.length;j++) {
				if(c3[i]==c3[j]) {
					count++;
					c3[i]='0';
				}
			}
			
			if(count>1 && c3[i]!='0') {
				System.out.println(count+" "+c3[i]);
			}
		}


	}

}
