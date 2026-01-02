package com2512;

import java.util.Scanner;

public class UserInputEx 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your id: ");
		int id  = sc.nextInt();
		
		System.out.println("Enter Your name: ");
		String name = sc.next();
		
		System.out.println("Enter Your salary: ");
		double salary = sc.nextDouble();
		
		System.out.println(id+" "+name+" "+salary);
				
				
	}

}
