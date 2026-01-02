package com2512;

public class NestedIfEx 
{
	public static void main(String[]args)
	{
		int age =68;
		if(age>=18)
		{
			
		if(age>=60)
		{
			System.out.println("Seniour Citizen");
		}
		else
		{
			System.out.println("Young age");
		}
	}
	else
	{
		System.out.println("Not Eligible to vote");
	}
	}
}
