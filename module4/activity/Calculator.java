package sef.module4.activity;

public class Calculator {

	private String calculatorType;
	public static final String CALC_TYPE_BASIC = "Basic";

	// Default constructor
	public Calculator() {}

	// Parameterized constructor
	public Calculator(String calculatorType) {
		this.calculatorType = calculatorType;
	}

	public String getCalculatorType() {
		return calculatorType;
	}

	public void setCalculatorType(String calculatorType) {
		this.calculatorType = calculatorType;
	}

	public int add(int x, int y) {
		return x + y;
	}

	public int subtract(int x, int y) {
		if (x > y) {
			return x - y;
		} else {
			return y - x;
		}
	}

	public int multiply(int[] numbers) {
		int result = 1;
		for (int number : numbers) {
			if(number == 0) {
				return 0;
			}
			result *= number;
		}
		return result;
	}

	public int divide(int x, int y) {
		if (y == 0) {
			throw new IllegalArgumentException("Cannot divide by zero!");
		}
		return x / y;
	}
}
