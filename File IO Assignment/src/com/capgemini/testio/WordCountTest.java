package com.capgemini.testio;

import java.io.*;
import java.util.Scanner;

public class WordCountTest {
	
	public static void main(String[] args) throws IOException, FileNotFoundException {
		
		//Scanner scanner = new Scanner(System.in);
		//System.out.println("Enter the path of the file:\n");
		//String path = scanner.next();
		int wordCount = 0;
		BufferedReader file = new BufferedReader(new FileReader("P:\\Users\\matripat\\Documents\\Advance Collection Assignment\\Temp.txt"));
		
		
		
		String line = file.readLine();
		
		while(line != null) {
			String[] count = line.split(" ");
			wordCount += count.length;
		}
		
		System.out.println("Total words in the file are: " + wordCount);
	}

}
