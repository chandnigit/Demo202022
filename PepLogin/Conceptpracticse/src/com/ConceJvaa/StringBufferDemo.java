package com.ConceJvaa;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer();
		sb.append("Mohit");
		String s="Mohit";
		sb.replace(1, 2, "ss");
		System.out.println(sb);
		System.out.println(sb.reverse());
		System.out.println(sb.toString().equals(s));
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.charAt(4));
		sb.setCharAt(0, 'c');
		//sb.insert(2, true);
			sb.trimToSize();
			System.out.println(sb);
			sb.delete(3, 5);
			System.out.println(sb.isEmpty());
			
			
			
			
			
			
			
		

	}

}
