package com.interview;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveOccuranceCharacter {

	public static void main(String[] args) {

		String s="sivasaiktkn";
		char a[]=s.toCharArray();
		 for(int i=0;i<s.length();i++) {
			 int c=1;
			 for(int j=i+1;j<s.length();j++) {
				 if(a[i]==a[j]) {
					 c++;
					 a[j]='0';
				 }
			 }
			 
			 if(c==1&&a[i]!='0') {
				 System.out.print(a[i]);
			 }
		 }

	}
}
