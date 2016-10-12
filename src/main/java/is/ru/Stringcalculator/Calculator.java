package is.ru.Stringcalculator;

puglic class Calculator {

	public static int add(String text){
		if(text.equals("")){
			return 0;
		}
		else if(text.contains(",")){
			return sum(SplitNumbers(text));
		}
		else
			return 1;
	}

}
