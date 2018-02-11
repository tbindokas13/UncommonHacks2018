package com.exprimentalqa.listeners;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import com.exprimentalqa.listeners.JavaSoundRecorder;
import com.exprimentalqa.listeners.ScreenRecorder;
import com.exprimentalqa.listeners.Merger;

public class GuiApp1 extends Thread {
	
	static Thread t1 = new Thread(){
        public void run(){
        	JavaSoundRecorder.main(null);    
        }
    };
    
   static // my second thread
   Thread t2 = new Thread(){
        public void run(){
        	 ScreenRecorder.main(null);  
        	 Merger.main(null);
        }
    };


public static void main (String[] args){  
	t1.start();
	 t2.start();
	  
  /*JFrame frame = new JFrame("Test");
  frame.setVisible(true);
  frame.setSize(1280,720);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  JPanel panel = new JPanel();
  frame.add(panel);
  JButton button = new JButton("hello agin1");
  panel.add(button);
  button.addActionListener (new Action1());

  JButton button2 = new JButton("hello agin2");
  panel.add(button2);
  button.addActionListener (new Action2()); */
}

/*static class Action1 implements ActionListener {        
  public void actionPerformed (ActionEvent e) {     

  }
}   
static class Action2 implements ActionListener {        
  public void actionPerformed (ActionEvent e) { 
	
  }
}*/
}
