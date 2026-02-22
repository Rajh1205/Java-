package com32.java;

import java.util.ArrayList;
import java.util.Iterator;

public class ListEx1 
{
	public static void main(String[] args)
	{
		ArrayList arrayList = new ArrayList();
		
		arrayList.add("Java");
		arrayList.add("Php");
		arrayList.add("Python");
		arrayList.add("Spring");
		arrayList.addFirst("Test1");
		
		ArrayList arrayList2 = new ArrayList();
		
		arrayList2.add("Android");
		arrayList2.add("ios");
		arrayList2.add("Flutter");
		arrayList2.add("Java");
		
		
		
		Iterator<String> i = arrayList.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		Iterator<String> i2 = arrayList2.iterator();
		
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		
	}

}
