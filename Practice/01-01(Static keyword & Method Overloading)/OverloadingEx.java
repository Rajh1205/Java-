package com0101.java;
class RBI
{
	int rate()
	{
		return 0;
	}
}
class SBI extends RBI
{
	int rate()
	{
		return 7;
	}
}
class ICICI extends SBI
{
	int rate()
	{
		return 9;
	}

public class OverloadingEx 
{
	public static void main(String[]args)
	{
//		SBI s = new SBI();
//		ICICI i = new ICICI();
//		RBI r = new RBI();
//		
//		System.out.println(s.rate());
//		System.out.println(i.rate());
//		System.out.println(r.rate());
		
		RBI r;
		
		r = new SBI();
		System.out.println(r.rate());
		r = new ICICI();
		System.out.println(r.rate());
		r = new RBI();
		System.out.println(r.rate());

	}

	}
	
	
}
