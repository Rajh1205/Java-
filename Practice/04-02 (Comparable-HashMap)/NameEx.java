package com42.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class MyStudent
{
	String name;
	
	public MyStudent(String name)
	{
		this.name = name;
	}
	
}

class NameComparator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2)
	{
		MyStudent s1 = (MyStudent)o1;
		MyStudent s2 = (MyStudent)o2;
		
		return s1.name.compareTo(s2.name);
	}
	
}
public class NameEx 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add(new MyStudent("Raj"));
		al.add(new MyStudent("Amit"));
		al.add(new MyStudent("jay"));
		
		Collections.sort(al,new NameComparator());
		
		Iterator r = al.iterator();
		
	 
	
		while(r.hasNext())
		{
			MyStudent st = (MyStudent)r.next();
			System.out.println(st.name);
		}
		
	}

}
