package com.capgemini.testio;

import java.io.File;
import java.io.IOException;

public class FileExistTest{
	
	public static void main(String[] args){
		File file = new File("P:\\Users\\matripat\\Documents\\Advance Collection Assignment\\Temp.txt");
		
		
		if(file.exists()) 

		System.out.println("File Exists");

		else
		System.out.println("file not exists");
	}

}
