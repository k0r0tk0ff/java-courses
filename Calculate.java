import java.io.*;
		import java.util.Scanner;


/*
 * @(#)Calculate.java
 *
 * Copyright (c)
 * Free to any use.
 *
 * @author_for_template		peterarsentev
 * @author_tester           k0r0tk0ff
 * @date		05/09/2016
 * @version		3.0
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

	public static double add(double first, double second){
		return first + second;
	}

	public static double substract(double first, double second){
		return first - second;
	}

	public static double multiple(double first, double second){
		return first * second;
	}

	public static double div(double first, double second) throws IllegalStateException{
		//public double div_value = 0.0;
		//try{
		//	div_value = first / second;
		//	if (div_value == Double.POSITIVE_INFINITY ||
		//			div_value == Double.NEGATIVE_INFINITY)
		//		throw new IllegalStateException();
		//}
		//catch (IllegalStateException e) {
		//System.out.println(" div on 0 !!!");
		//}
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
			System.out.println("  Enter the arguments and operation manually: \n");
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
		 * Code is commented? becouse the Maven do not compile whith
		 * operand Switch-Case

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
		 try{
		 Result.div(first, second);
		 if (Result.div(first, second) == Double.POSITIVE_INFINITY ||
		 Result.div(first, second) == Double.NEGATIVE_INFINITY)
		 throw new IllegalStateException();
		 } catch (IllegalStateException e) {
		 System.out.println(" div on 0 !!!");
		 }
		 break;
		 default: System.out.println("\n Invalid entered operation");
		 break;
		 }

		 */

		/**
		 * Do operation, that has been entered whith If-Else construction
		 */

		if(entered_operation.equals("+")){
			Result.getResult(Result.add(first, second));
		}else if(entered_operation.equals("-")){
			Result.getResult(Result.substract(first, second));
		}else if(entered_operation.equals("x")){
			Result.getResult(Result.multiple(first, second));
		}else if(entered_operation.equals("^")){
			Result.getResult(Result.expand(first, second));
		}else if(entered_operation.equals("/")){
			try{
				Result.div(first, second);
				if (Result.div(first, second) == Double.POSITIVE_INFINITY ||
						Result.div(first, second) == Double.NEGATIVE_INFINITY)
					throw new IllegalStateException();
			} catch (IllegalStateException e) {
				System.out.println(" div on 0 !!!");
			}
		}else System.out.println("\n Invalid entered operation");
	}
}


