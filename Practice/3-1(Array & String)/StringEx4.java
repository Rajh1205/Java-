package com0301.java;

public class StringEx4 
{ 
	public static void main(String[]args)
	{
		String s1 = "Raj";
		String s2 = "Raj";
		String s3 = "Rahul";
		String s4 = new String ("Raj");
		String s5 = "RAJ";
		String s6 = "Dharini";
		String s7 = "abcd is programing language,abcd is a everygreen platform";
		
		System.out.println(s1.toUpperCase());
		System.out.println(s6.toLowerCase());
		System.out.println(s3.trim());
		System.out.println(s2.charAt(1));
		
		System.out.println(s7.replace("abcd", "java"));
		

}
}