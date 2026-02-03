package com32.java;

import java.util.HashSet;
import java.util.Iterator;

public class SetEx2 
{
	public static void main(String[] args) 
	{
		HashSet set1 = new HashSet();
		
		set1.add(101);
		set1.add(102);
		set1.add(103);
		set1.add(104);
		set1.add(109);
		set1.add(105);
		
		
		Iterator r = set1.iterator();
		
		while(r.hasNext())
		{
			System.out.println(r.next());
		}
		
		
		
		
		
	}

}
