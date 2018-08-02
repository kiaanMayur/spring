package com.capgemini.streamtest;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
import java.util.stream.IntStream;

public class OddPrimePallindrome {
	
	public boolean isOdd(int odd) {
		
		
	}
	
	public boolean isPrime(int prime) {
		
		IntPredicate checkPrime = index -> prime % index == 0;
		return prime > 1 && IntStream.range(2, prime - 1).noneMatch(checkPrime);
	}

}
