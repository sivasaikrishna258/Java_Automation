package com.interview;

public class INterviewQuestion {

	public static void main(String[] args) {

		String s="ab2gd7wm89qls9";
		char c[]=s.toCharArray();
		for(int i=0;i<s.length();i++){
			if(Character.isDigit(c[i]) ){

				if(!(Character.isDigit(c[i+1]) || Character.isDigit(c[i-1])) ){
				System.out.println(c[i+1]);
				System.out.println(c[i-1]);

			}
			}
		}
		}
	}


