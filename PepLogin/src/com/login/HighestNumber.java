package com.login;

public class HighestNumber {

	public static void main(String[] args) {
		String s[]= {"coffe","tea","water","dietCock"};
		String l="";
		int max=0;
		int a[]=new int[s.length];
		for(int i=0;i<s.length;i++)
		{
			l=s[i];
			a[i]=l.length();
			if(a[i]<max)
			{
				max=a[i];
				}
			
			
			
		}
		System.out.println("min"+max);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		

	}

}
