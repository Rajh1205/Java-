package com32.java;

import java.util.Vector;

public class VectorEx 
{
	public static void main(String[] args) 
	{
		Vector v = new Vector();
		
		v.addElement("r");
		v.addElement("a");
		v.addElement("j");
		v.addElement("h");
		v.addElement("g");
		v.addElement("o");
		v.addElement("d");
		v.addElement("h");
		v.addElement("a");
		v.addElement("n");
		v.addElement("i");
		
		System.out.println(v);
		
		System.out.println("Size:"+v.size());
		System.out.println("Capacity:"+v.capacity());
		System.out.println(v.contains("a"));
		v.clear();
		
		
		
	}

}
