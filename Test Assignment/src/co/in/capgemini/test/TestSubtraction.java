package co.in.capgemini.test;

import org.junit.Assert;
import org.junit.Test;

import co.in.capgemini.calculator.Maths;

public class TestSubtraction {

	@Test
	public void testBothPositive() {
		Maths math = new Maths();
		int answer = math.subtract(2, 3);
		Assert.assertEquals(-1, answer);
	}
	
	@Test
	public void testBothNegative() {
		Maths math = new Maths();
		int answer = math.subtract(-2, -3);
		Assert.assertEquals(1, answer);
	}
	
	@Test
	public void testOnePositiveOneNegative() {
		Maths math = new Maths();
		int answer = math.subtract(-2, 3);
		Assert.assertEquals(-5, answer);
	}
	
	@Test
	public void testFirstPositiveSecondNegative() {
		Maths math = new Maths();
		int answer = math.subtract(2, -3);
		Assert.assertEquals(5, answer);
	}
	
	@Test
	public void testBothZero() {
		Maths math = new Maths();
		int answer = math.subtract(0, 0);
		Assert.assertEquals(0, answer);
	}
	

}
