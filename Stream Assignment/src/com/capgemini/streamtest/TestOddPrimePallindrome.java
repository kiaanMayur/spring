package com.capgemini.streamtest;

public class TestOddPrimePallindrome {

	public static void main(String[] args) {
		
		OddPrimePallindrome checkOdd = new OddPrimePallindrome();
		
		if(checkOdd.isPrime(123))
			System.out.println("yes");
		else
			System.out.println("no");
		

	}

}
