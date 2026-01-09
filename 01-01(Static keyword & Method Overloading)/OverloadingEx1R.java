package com0101.java;

public class OverloadingEx1R
{
	
		int raj(int a, int b)
		{
			return a*b;
		}
		int raj(int a ,int b,int c)
		{
			return a+b+c;
		}
		public static void main(String[]args)
		{	
			OverloadingEx1R c1 = new OverloadingEx1R();
			System.out.println(c1.raj(5, 5));
		
		
	    }

}
