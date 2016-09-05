import java.io.*;
import java.util.Scanner;


/*
 * @(#)Calculate.java
 *
 * Copyright (c)
 * Free to any use.
 *
 * @author_for_template		peterarsentev
 * @author_tester      k0r0tk0ff
 * @date		03/09/2016
 * @version		1.0
 *
 * Create class Calculate. Add "+","-","*","/","^" operation.
 * Must be adaptive to type int, short, long, float, double.
 * Check second arg for division on zero. If second arg == 0 spawn java.lang.IllegalStateException
 *
 */


public class Calculate{
	//private static final Logger log = getLogger(Calculator.class);

	public void getResult(double getResult1) {
		System.out.println("\n Result is "+getResult1);
	}

	public static double add(double first, double second) {
		return first + second;
	}

	public static double substract(double first, double second) {
		return first - second;
	}

	public static double multiple(double first, double second) {
		return first * second;
	}

	public static double div(double first, double second) {
		//double div_value = 0.0;
		//try{
		//	div_value = first / second;
		//}
		//catch (UnsupportedOperationException e1) {
		//System.out.println(" div on 0 !!!");
		//}

		//return div_value;
		return first / second;
	}

	public static double expand(double first, double second) {
		double expand_value = 1.0;
		if(second == 0) expand_value = 1.0;
			else if(second == 1) expand_value = first;
				else {
					for (int i = 0; i < second; i++) {
						expand_value = expand_value * first;
						}
				}
		return expand_value;
	}

	public static void main(String[] arg) throws Exception {
		double first = 0.0;
		String entered_operation = new String("x");
		double second = 0.0;
		Calculate Result = new Calculate();
		Scanner reader = new Scanner(System.in);

		/**
		 * Try parse the enterred arguments in CLI
		 */
			try {
				first = Double.parseDouble(arg[0]);
				entered_operation = String.valueOf(arg[1]);
				second = Double.parseDouble(arg[2]);

		/**
		 * Interactive entering the arguments
		 */

			} catch (ArrayIndexOutOfBoundsException e2) {
				System.out.println("  This program takes 3 parameters (for CLI and Interact enter): ");
				System.out.println("  Enter the arguments and operation manully: \n");
				System.out.println("  Argument 1; Operation (+, -, x, /, ^); Argument 2; \n");
				first = Double.parseDouble(reader.next());
				entered_operation = reader.next();
				second = Double.parseDouble(reader.next());
			}

		/**
		 * Checking the entered arguments
		 */

		System.out.println(" Argument 1 = "+first);
		System.out.println(" Operation  = "+entered_operation);
		System.out.println(" Argument 2 = "+second);

		/**
		 * Do operation, that has been entered
		 */

		switch (entered_operation) {
			case "+":
				Result.getResult(Result.add(first, second));
				break;
			case "-":
				Result.getResult(Result.substract(first, second));
				break;
			case "x":
				Result.getResult(Result.multiple(first, second));
				break;
			case "^":
				Result.getResult(Result.expand(first, second));
				break;
			case "/":
				Result.getResult(Result.div(first, second));
				//Result.div(first, second);
				break;
			default: System.out.println("\n Invalid entered operation");
				break;
		}
	}
}

