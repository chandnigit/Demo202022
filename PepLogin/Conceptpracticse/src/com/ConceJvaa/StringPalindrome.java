package com.ConceJvaa;

public class StringPalindrome {

	public static void main(String[] args) {
		String s="madam";
		char a[]= {'a','d','d','t','r'};
		System.out.println(String.valueOf(a));
		String ss="";
		for(int i=s.length()-1;i>=0;i--)
		{
			//System.out.print(s.charAt(i));
			ss=ss+s.charAt(i);
			
		}
		if(s.equals(ss))
			
		{
			System.out.println("string is palindrome");
		}
		else
		{
			System.out.println("given string is not palindrome");
		}

	}

}
