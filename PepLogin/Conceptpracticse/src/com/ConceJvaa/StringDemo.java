package com.ConceJvaa;

public class StringDemo {

	public static void main(String[] args) {
		/*String s=new String("dd");
		String s1=new String("dd");
		synchronized (s1) {
			
		}
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
		String ss="guru";
		String sss="guru";
		System.out.println(ss==sss);
		StringBuffer sb=new StringBuffer();
		sb.append("Durgaaa");
		StringBuffer sc=new StringBuffer("Durgaaaa");
		//sc.compareTo(sb);
		System.out.println(sb==sb);
		char c[]= {'a','b','b'};
		String cc=new String(c);
		System.out.println(cc); 
		String c=" Chandni Gupta  ";
		System.out.println(c.charAt(5));
		System.out.println(c.concat("mohit"));
		System.out.println(c.equals("Mohit"));
		System.out.println(c.equalsIgnoreCase("Chandni GupTa"));
		System.out.println(c.substring(6));
		System.out.println(c.substring(5, 10));
		System.out.println(c.length());
		System.out.println(c.trim());
		
		System.out.println(c.indexOf('i'));
		System.out.println(c.lastIndexOf('i')); 
		String m="Mohitt";
		System.out.println(m.replace('t', 'e'));
		
		StringBuffer sb=new StringBuffer();
		
		sb.append("agtrqwecvbnmjkiuytggjgj");
		System.out.println(sb.capacity());*/
		
		String s=new String("chandni,chvfhh");
		String s1=new String("chandni");
		String s2="Mohit,vghv";
		String s3="chandni";
		System.out.println(s==s1);
		System.out.println(s1==s3);
		System.out.println(s2.format(s3, "kk"));
		
		//.out.println(s2.split(","));
		String aa[]=s2.split(",");
		for(String sub:aa)
		{
			System.out.println(sub);
		}
		
		
		

	}

}
