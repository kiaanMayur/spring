package co.in.capgemini.test;

import org.junit.Assert;
import org.junit.Test;

import co.in.capgemini.calculator.Maths;

public class TestMultiplication {

	@Test
	public void testBothPositive() {
		Maths math = new Maths();
		
		int result = math.multiplication(2,3);
		Assert.assertEquals(6, result);
	}
	
	@Test
	public void testBothNegative() {
		Maths math = new Maths();
		
		int result = math.multiplication(-2,-3);
		Assert.assertEquals(6, result);
	}
	
	@Test
	public void testOneNegativeOnePostive() {
		Maths math = new Maths();
		
		int result = math.multiplication(-2,3);
		Assert.assertEquals(-6, result);
	}
	
	@Test
	public void testWithZero() {
		Maths math = new Maths();
		
		int result = math.multiplication(0,3);
		Assert.assertEquals(0, result);
	}

}
