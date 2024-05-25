package com.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CollectionEx {

	public static void main(String[] args) {

		
		Map<String,String> map=new HashMap<>();
		
		map.put("name" , "aiv");
		map.put("age", "20");
		map.put("name", "null");
		map.put("age", "30");

		for(Entry<String, String> m:map.entrySet()) {
			System.out.println(m.getKey()+""+m.getValue());
		}
	}

}
