package is.ru.Stringcalculator;
import java.util.List;
import java.util.ArrayList;

public class Calculator {

	public static int add(String text){
		if(text.equals(""))
			return 0;

		else if(text.contains(",")) {
			return sum(splitNumbers(text));
			}

		else
			return 1;
	}

	private static String[] splitNumbers(String numbers){
	    return numbers.split(",|\n");
	}

	static int toInt(String text) {
		return Integer.parseInt(text);
	}

	private static int sum(String[] numbers){
 	    int total = 0;
        for(String number : numbers){
        	if(toInt(number) < 0)
        		throw new RuntimeException("Negatives not allowed: " + number);
        	if(toInt(number) <= 1000)
		    	total += toInt(number);
		}
		return total;
    }

}
