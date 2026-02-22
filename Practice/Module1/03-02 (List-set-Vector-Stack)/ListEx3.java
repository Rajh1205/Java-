package com32.java;

import java.util.ArrayList;
import java.util.Iterator;

public class ListEx3
{
	public static void main(String[] args) 
	{
		
		ArrayList arrayList = new ArrayList();
		
		arrayList.add("java");
		arrayList.add("Php");
		arrayList.add("Python");
		arrayList.add("Spring");
		arrayList.add("java");
		
		Iterator<String> r = arrayList.iterator();
		
		while(r.hasNext())
		{
			System.out.println(r.next());
		}
		
		
	}

}
