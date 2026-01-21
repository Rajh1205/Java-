package com0301.java;

public class StringEx3 
{
	public static void main(String[]args)
	{
		String s1 = "Raj";
		String s2 = "Raj";
		String s3 = "Rahul";
		String s4 = new String ("Raj");
		String s5 = "RAJ";
		String s6 = "Dharini";
		
		
		//equals:
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(s3));
		
		//equalsignorecase:
		System.out.println(s1.equals(s5));
		System.out.println(s1.equalsIgnoreCase(s5));
		
		
		//compareTo
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s6));
		
		//==
		System.out.println(s1==s2);
		System.out.println(s1==s4);
	
		
	}

}
