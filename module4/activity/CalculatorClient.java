package sef.module4.activity;

public class CalculatorClient {

	public static void main(String[] args) {

		Calculator basicCalc = new Calculator(Calculator.CALC_TYPE_BASIC);

		System.out.println("*** Calculations will be performed using "+basicCalc.getCalculatorType()+ " calculator ***");

		// Add
		int result = basicCalc.add(4, 5);
		System.out.println("1) Add result is " + result);

		// Subtract
		result = basicCalc.subtract(9, 5);
		System.out.println("2) Subtract result is " + result);

		// Multiply
		int[] mul = {2, 3, 4};
		result = basicCalc.multiply(mul);
		System.out.println("3) Multiplication result is " + result);

		// Divide
		result = basicCalc.divide(20, 5);
		System.out.println("4) Division result is " + result);
	}
}
