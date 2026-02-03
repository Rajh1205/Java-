package com32.java;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class SetEx1
{
	public static void main(String[] args) 
	{
		LinkedHashSet set1 = new LinkedHashSet();
		
		set1.add("Java");
		set1.add("Php");
		set1.add("Python");
		set1.add("Spring");
		set1.add("Java");
		set1.add("Php");
		
		Iterator<String> r = set1.iterator();
		
		while(r.hasNext())
		{
			System.out.println(r.next());
		}
		
		
	}

}
