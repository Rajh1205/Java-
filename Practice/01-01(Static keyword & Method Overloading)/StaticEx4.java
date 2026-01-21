package com0101.java;

public class StaticEx4 
{
    int id;
    String name;
    static String collage = "VVP";
    
    public StaticEx4(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    void display()
    {
        System.out.println(id + " " + name + " " + collage);
    }

    static void change()
    {
        collage = "Atmiya";
    }
}
