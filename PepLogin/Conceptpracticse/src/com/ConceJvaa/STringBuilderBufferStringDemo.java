package com.ConceJvaa;

import java.util.HashMap;
import java.util.Map;

final public class STringBuilderBufferStringDemo {

	private final String name;
	private final int rollNo;
	private final Map<String, String> map;
	
	public String getName() {
		return name;
	}

	public int getRollNo() {
		return rollNo;
	}
	

	public Map<String, String> getMap() {
		Map<String,String> temp=new HashMap<String, String>(); 
		for(Map.Entry<String,String> e:map.entrySet()) {
			temp.put(e.getKey(), e.getValue());
		}
		return temp;
	}

	public STringBuilderBufferStringDemo(String name, int rollNo, Map<String, String> map) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		Map<String,String> temp=new HashMap<String, String>(); 
		for(Map.Entry<String,String> e:map.entrySet()) {
			temp.put(e.getKey(), e.getValue());
		}
		this.map = temp;
		
	}

	@Override
	public String toString() {
		return "STringBuilderBufferStringDemo [name=" + name + ", rollNo=" + rollNo + ", map=" + map + "]";
	}

	
	
	
	/*public static void main(String[] args) {
		final StringBuffer sb=new StringBuffer("abc");
		sb.append("ccc");
		sb=new StringBuffer();
		System.out.println(sb);

	*/

}

