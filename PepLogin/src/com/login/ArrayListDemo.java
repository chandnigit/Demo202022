package com.login;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList c=new ArrayList();
c.add("ss");
c.add(1);
c.addAll(c);
System.out.println(c);
List l=Collections.synchronizedList(c);
System.out.println(l);
Vector v=new Vector<>();
v.addElement(23);
v.addElement(65);
v.addElement(78);
Enumeration e=v.elements();
while(e.hasMoreElements())
{
	//Integer i=(Integer)e.nextElement();
	System.out.println(e.nextElement());
}



	}

}
