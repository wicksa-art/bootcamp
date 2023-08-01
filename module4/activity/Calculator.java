/**
 *
 */
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

	// Getter for CalculatorType
	public String getCalculatorType() {
		return calculatorType;
	}

	// Setter for CalculatorType
	public void setCalculatorType(String calculatorType) {
		this.calculatorType = calculatorType;
	}

	// Add 
	public int add(int x, int y) {
        return x + y;
	}

	// Subtract
	public int subtract(int x, int y) {
		int diff = 0;
		if (x > y) {
			diff = x - y;
		} else {
			diff = y - x;
		}

		return diff;
	}

	// Multiply
	public int multiply(int[] numbers) {
		int temp = 1;

		for (int number : numbers) {
			temp = temp * number;
		}
		return temp;

	}

	// Divide
	public int divide(int x, int y) {
		if (y == 0) {
			throw new IllegalArgumentException("Cannot divide by zero!");
		} else {
			return x / y;
		}
	}
}
