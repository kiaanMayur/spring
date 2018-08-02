package co.in.capgemini.test;
import org.junit.Assert;
import org.junit.Test;

import co.in.capgemini.calculator.Maths;

public class TestDivision {

	@Test
	public void testBothPositve() {
		Maths math = new Maths();
		double result = math.divide(4.0, 2.0);
		Assert.assertEquals(2.0, result, 0);
	}
	
	@Test
	public void testBothNegative() {
		Maths math = new Maths();
		double result = math.divide(-4.0, -2.0);
		Assert.assertEquals(2.0, result, 0);
	}
	
	@Test
	public void testFirstPositveSecondNegative() {
		Maths math = new Maths();
		double result = math.divide(4.0, -2.0);
		Assert.assertEquals(-2.0, result, 0);
	}
	
	@Test
	public void testBFirstLowerSecondHigher() {
		Maths math = new Maths();
		double result = math.divide(2.0, 4.0);
		Assert.assertEquals(0.5, result, 0);
	}
	
	@Test
	public void testFirstZero() {
		Maths math = new Maths();
		double result = math.divide(0.0, 2.0);
		Assert.assertEquals(0.0, result, 0);
	}
	
	@Test
	public void testLowerZero() {
		Maths math = new Maths();
		double result = math.divide(0, 0);
		Assert.assertEquals(2, result, 0);
	}

}
