package com2512;

import java.util.Scanner;

public class EmailPassEx 
{
  public static void main(String[]args)
  {
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter Your e-mail: ");
	  String Email = sc.next();
	  
	  System.out.println("Enter your Password: ");
	  String Password = sc.next();
	  
	  if(Email.equals("rajhgodhani266@gmail.com")&& Password.equals("1234"))
	  {
		  System.out.println("Logged in Success");
	  }
	  else
	  {
		  System.out.println("Log in Fail");
	  }
  }
}
