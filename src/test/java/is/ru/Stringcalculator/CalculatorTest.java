package is.ru.Stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
	
	
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}

	
	public void testOneNumber() {
		assertEquals(1, Calculator.add("1"));
	}
}