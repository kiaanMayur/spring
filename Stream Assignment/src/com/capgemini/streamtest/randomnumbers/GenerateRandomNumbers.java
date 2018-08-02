package com.capgemini.streamtest.randomnumbers;

import java.util.Random;

public class GenerateRandomNumbers {
	
	public int[] genrateNumbers() {
		
		int[] numberList = new Random().ints(100, 1, 49).toArray();
		return numberList;
	}

}
