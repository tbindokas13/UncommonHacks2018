package com.exprimentalqa.listeners;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
class BackgroundImageJFrame extends JFrame
{
JButton b1;
JLabel l1;
	public BackgroundImageJFrame()
	{
	setTitle("Scroll");
	setSize(400,400);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);
/*
	One way
	-----------------
	setLayout(new BorderLayout());
	JLabel background=new JLabel(new ImageIcon("C:\\Users\\Computer\\Downloads\\colorful design.png"));
	add(background);
	background.setLayout(new FlowLayout());
	l1=new JLabel("Here is a button");
	b1=new JButton("I am a button");
	background.add(l1);
	background.add(b1);
*/
// Another way
	setLayout(new BorderLayout());
	setContentPane(new JLabel(new ImageIcon("C:\\Users\\Zaid\\Desktop\\img.jpg")));
	setLayout(new FlowLayout());
	l1=new JLabel("Click this button to begin lecture Recording");
	b1=new JButton(new ImageIcon("C:\\Users\\Zaid\\Desktop\\img1.png"));
	b1.addActionListener (new Action1());
	add(l1);
	add(b1);
	// Just for refresh :) Not optional!
	setSize(399,399);
	setSize(1280,720);
	}
	static class Action1 implements ActionListener {        
		  public void actionPerformed (ActionEvent e) {     
			 GuiApp1.main(null);
			  
		  }
		}   
	public static void main(String args[])
	{
	new BackgroundImageJFrame();
	}
}