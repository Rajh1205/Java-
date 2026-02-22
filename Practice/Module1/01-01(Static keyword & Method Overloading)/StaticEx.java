package com0101.java;

public class StaticEx 
{
	static int count =0 ; 
	
	public StaticEx()
	{
		count++;
		System.out.println(count);
	}
	public static void main(String[]args)
	{
		StaticEx s1 = new StaticEx();
		StaticEx s2 = new StaticEx();
	}

}
