package com.example;

/*Lab 4.1: Create a class Student with attributes (name, age) and a method to display the
details.*/

public class Student {
	
	String name;
	int age;

	void display() 
	{
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		s1.name = "Raj";
		s1.age = 22;
		
		s1.display();
	}

}
