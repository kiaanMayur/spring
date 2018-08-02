package com.capgemini.testio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NewLineCount {
	
	public static void main(String[] args) throws IOException, FileNotFoundException {
		
		int count = 0;
		String line = null;
		BufferedReader file = new BufferedReader(new FileReader("P:\\Users\\matripat\\Documents\\Advance Collection Assignment\\src\\com\\capgemini\\advancecollection\\MovieDetails.java"));
		
		try {
			while((line = file.readLine()) != null) {
		
			count++;	
		} } catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Total number of new lines: " + count);
	
	}

}
