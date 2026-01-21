package com0101.java;

abstract class A
{
	abstract void a();
	
	void b()
	{
		
	}
	
}

class B extends A
{
	void a()
	{
		
	}
}

public class AbstractionEx
{
	public static void main(String[]args)
	{
		B b1 = new B();
		b1.a();
		b1.b();
	}

}
