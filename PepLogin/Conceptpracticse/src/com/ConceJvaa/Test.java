package com.ConceJvaa;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		Map<String, String> map=new HashMap<String, String>();
		map.put("cg", "mk");
		STringBuilderBufferStringDemo a=new STringBuilderBufferStringDemo("mk", 123,map);
		System.out.println(a);
		map.put("cgj", "mkkk");
		a.getMap().put("vk", "mk");
		System.out.println(a);
	}
}
