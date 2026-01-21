package com2001.java;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class task implements ActionListener
{
	JFrame frame;
	JTextField tf1,tf2,tf3,tf4,tf5;
	JLabel l1,l2,l3,l4,l5,l6;
	JButton bt1,bt2,bt3;
	
	public task()
	{
		frame = new JFrame ();
		
		frame.setLayout(null);
		tf1 = new JTextField();
		tf1.setBounds(150, 40, 200, 25);
		
	    tf2 = new JTextField();
	    tf2.setBounds(150,90,200,25);
	    
	    tf3 = new JTextField();
	    tf3.setBounds(150,140,200,25);
		
		tf4 = new JTextField();
		tf4.setBounds(150,190,200,25);
		
		tf5 = new JTextField();
		tf5.setBounds(150,240,200,25);
		
		l1= new JLabel("Registration no: ");
		l1.setBounds(15,40,200,25);
		
		l2= new JLabel("Student name: ");
		l2.setBounds(15, 90, 200, 25);
		
		l3= new JLabel("Batch: ");
		l3.setBounds(15, 140, 200, 25);
		
		l4= new JLabel("Department: ");
		l4.setBounds(15,190,200,25);
		
		l5= new JLabel("Address: ");
		l5.setBounds(15,240,200,25);
		
		l6 = new JLabel("Registration Form");
		l6.setBounds(75,-100,250,250);
		
		
		bt1 = new JButton("Reset");
		bt1.setBounds(15,290,100,50);
		
		bt2= new JButton("Register");
		bt2.setBounds(150,290,100,50);
		
		bt3= new JButton("Back");
		bt3.setBounds(75,350,100,50);
		
		
		
		frame.setSize(800,800);
		frame.setVisible(true);
		frame.add(tf1);
		frame.add(tf2);
		frame.add(tf3);
		frame.add(tf4);
		frame.add(tf5);
		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(l4);
		frame.add(l5);
		frame.add(l6);
		frame.add(bt1);
		frame.add(bt2);
		frame.add(bt3);
	}
	public static void main(String[]args)
	{
		new task();
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		
	}

}
