package com.login;

import java.util.Collection;

public class Toggle {

	public static void main(String[] args) {
		int m=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j<=i)
				{
					System.out.print(m+" ");
					m++;
					
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
		

	}

}
