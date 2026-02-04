package com42.java;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String>map = new HashMap();
		
		map.put(101, "Khushi");
		map.put(102, "Raj");
		map.put(103, "Karan");
		
		
		for(Map.Entry m : map.entrySet() )
		{
			System.out.println(m.getKey()+" "+m.getValue());
			System.out.println();
		}
		
		
		
	}

}
