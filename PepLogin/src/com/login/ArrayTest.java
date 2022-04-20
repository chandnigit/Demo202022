package com.login;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7};
		int b[]= {10,11,12};
		int merge[]=new int[a.length+b.length];
		int sum=0;
		//sum of the integer 
		//Avg of no
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		
		}
		System.out.println("sum of given no="+sum);
		System.out.println("average="+sum/2);
		//merge two array
		for(int j=0;j<a.length;j++)
		{
			merge[j]=a[j];
		}
		for(int k=0;k<b.length;k++)
		{
			merge[a.length+k]=b[k];
		}
		System.out.print("merge of two Array=");
		for(int l=0;l<merge.length;l++)
		{
			System.out.print(" "+merge[l]);
		}
		//reverese the array
		//String s[]= {"true","false","true","false","false","true"};
		//find max vale and index
		int m[]= {2,5,1,9,6};
		int max=0,index=0;
		for(int i=0;i<m.length;i++)
		{
			
			if(m[i]>max)
			{
				max=m[i];
				index=i;
			}
			
		}
		System.out.println("\n max Value  ="+max+"  ,index of max val="+index);
		
		}
	}
