package is.ru.Stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testOneNumber() {
		assertEquals(1, Calculator.add("1"));
	}

	@Test
	public void testTwoNumbers() {
		assertEquals(3, Calculator.add("1,2"));
	}

	@Test
	public void testFourNumbers() {
		assertEquals(10, Calculator.add("1,2,3,4"));
	}

	@Test
	public void testNewlineBetweenNumbers() {
		assertEquals(6, Calculator.add("1\n2,3"));
	}

	@Test
	public void testGreaterThan1000() {
		assertEquals(4, Calculator.add("1,1002,3"));
	}

	@Test(expected = RuntimeException.class)
	public void testNegative() {
		assertEquals(-3, Calculator.add("4,-3,6,5"));
	}
}