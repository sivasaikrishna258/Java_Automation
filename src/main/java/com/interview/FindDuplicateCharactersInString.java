package com.interview;

public class FindDuplicateCharactersInString {

	public static void main(String[] args) {

		String s="SivasaAaisi";
		
		s=s.toLowerCase();
		//char c[]=s.toCharArray();
		
		// s=new String(c);
		char c1[]=s.toCharArray();
		
		for(int i=0;i<c1.length;i++) {
			int count=1;
			for(int j=i+1;j<c1.length;j++) {
				if(c1[i]==c1[j]) {
					count++;
					c1[j]='0';//setting to  0 to avoid print visited character
				}
			}
			if(count>1&&c1[i]!='0') {
				System.out.println(c1[i]+" "+count);
			}
		}
	}

}
