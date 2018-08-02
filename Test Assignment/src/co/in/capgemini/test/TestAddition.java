package co.in.capgemini.test;
import org.junit.Assert;
import org.junit.Test;

import co.in.capgemini.calculator.Maths;

public class TestAddition {

	@Test
	public void testPositiveAddition() {
		Maths math = new Maths();
		
		int answer = math.add(2, 3);
		Assert.assertEquals(5, answer);

	}
	
	@Test
	public void testNegativeAddition() {
		Maths math = new Maths();
		
		int answer = math.add(-2, -3);
		Assert.assertEquals(-5, answer);

	}
	
	@Test
	public void testPositiveAndNegativeAddition() {
		Maths math = new Maths();
		
		int answer = math.add(-2, 3);
		Assert.assertEquals(1, answer);

	}
	
	@Test
	public void testZeroAddition() {
		Maths math = new Maths();
		
		int answer = math.add(0, 0);
		Assert.assertEquals(0, answer);

	}

}
