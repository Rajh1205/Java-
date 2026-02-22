package com32.java;

import java.util.LinkedList;

public class ListEx2 
{
	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.addFirst("e");
		
		
		System.out.println(list);
	}

}
