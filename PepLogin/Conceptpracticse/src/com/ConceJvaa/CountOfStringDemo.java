package com.ConceJvaa;

public class CountOfStringDemo {

	public static void main(String[] args) {
		
		String s="hello world kaise vvv ho";
		//System.out.println(s.toUpperCase());
		String s1[]=s.split("\\s");
		String ss="";
		int count =0;
		String rev=" ";
		for(String i:s1)
		{
			/*System.out.print("  "+i);
			ss=ss+i;
			count++;*/
			String hh=i;
			for(int f=0;f<hh.length();f++)
			{
				 rev=hh.charAt(f);
			}
			String first=rev.substring(0,1);
			String last=rev.substring(1);
			ss+=first.toLowerCase()+last.toUpperCase()+" ";
		}
		System.out.println(ss);
		
		

	}

}
