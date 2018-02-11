package com.exprimentalqa.listeners;
import java.io.*;
	 
public class Merger {
	 
	public static void main(String[] args)
    {
        try
        {
            // Just one line and you are done ! 
            // We have given a command to start cmd
            // /K : Carries out command specified by string
        	ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "t.bat");
        	File dir = new File("C:/Users/Zaid/Desktop/Scroll/");
        	pb.directory(dir);
        	Process p = pb.start();
           //Runtime.getRuntime().exec("cmd /c start cmd.exe");
 
        }
        catch (Exception e)
        {
            System.out.println("HEY Buddy ! U r Doing Something Wrong ");
            e.printStackTrace();
        }
    }
	}
