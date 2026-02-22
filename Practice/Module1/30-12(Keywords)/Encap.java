package com3012;

public class Encap 
{
	public static void main(String[]args)
	{
	    Model m = new Model();
		
		m.setName("Raj");
		m.setSurname("Godhani");
		m.setCity("Rajkot");
		
		System.out.println(m.getName()+" From "+m.getCity());
	}

}
