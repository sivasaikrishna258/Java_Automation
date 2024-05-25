package com.interview;

public class RemoveDuplicateElementsFromArray {

	public static void main(String[] args) {

		int a[]= {1,2,3,2,3,1,6};
	
		for(int i=0;i<a.length;i++) {
			int c=1;
			for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]) {
				c++;
					a[j]='0';	
						
		} 
			
			
	}
		if(c==1&&a[i]!='0') {
			System.out.println(a[i]);
		}
	}

	}
}
