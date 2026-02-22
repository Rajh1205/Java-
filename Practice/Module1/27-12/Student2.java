package com2712;

public class Student2
{
	int id;
	String name;
	
	void display()
	{
		System.out.println(id+" "+name);
	}
	
	public static void main(String[]args)
	{
		
		Student2 s1 = new Student2();
		Student2 s2 = new Student2();
		Student2 s3 = new Student2();
		Student2 s4 = new Student2();
		
		s1.id=101;
		s1.name="Raj";
		
		s2.id=102;
		s2.name="Raj2";
		
		s1.display();
		s2.display();
	}

}
