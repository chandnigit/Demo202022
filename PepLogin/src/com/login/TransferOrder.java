package com.login;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TransferOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="chandni";
		char[] b=a.toCharArray();
		Map<Character, Integer> countMap=new LinkedHashMap<Character, Integer>();
		for(char c:b) {
			if(countMap.containsKey(c))
			{
				
				countMap.put(c, countMap.get(c)+1);
			}else {
				countMap.put(c, 1);
			}
		}
		for(Map.Entry<Character, Integer> iterate:countMap.entrySet()) {
			System.out.println(iterate.getKey()+":"+iterate.getValue());
		}

	}

}
