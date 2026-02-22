package com0101.java;

public class OverloadingEx2 
{
	int cal1(int a, int b)
	{
		return a+b;
	}
	double cal (int a,int b)
	{
		return a*b;
	}
	
	public static void main(String[]args)
	{
		OverloadingEx2 o2= new OverloadingEx2();
		System.out.println(o2.cal(10,12));
	}

}
