package is.ru.Stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
	
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}
}