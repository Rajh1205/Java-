package com2512;

import java.util.Scanner;

public class ElseifEx
{
    public static void main(String[]args)
    {
    	System.out.println("Enter your Marks: ");
    	Scanner sc = new Scanner(System.in);
    	int Marks = sc.nextInt();
    	
    	if(Marks>=70)
    	{
    		System.out.println("A Grade");
    	}
    	else if(Marks>=60)
    	{
    		System.out.println("B Grade");
    	}
    	else if (Marks>=50)
    	{
    		System.out.println("C Grade");
    	}
    	else if(Marks>=40)
    	{
    		System.out.println("D Grade");
    	}
    	else
    	{
    		System.out.println("Fail");
    	}
    }
}
