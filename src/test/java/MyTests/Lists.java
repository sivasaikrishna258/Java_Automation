package MyTests;

import java.util.*;

public class Lists {

	public static void main(String[] args) {
List <Integer> l=new ArrayList<>();
l.add(10);
l.add(20);
l.add(10);
l.add(40);
l.add(50);

Iterator<Integer> itr=l.iterator();
//while(itr.hasNext()) {
	System.out.println(l.set(4, 20));


	}

}
