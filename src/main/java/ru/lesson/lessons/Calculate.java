package ru.lesson.lessons;

/*
 * @(#)Calculate.java
 *
 * Copyright (c)
 * Free to any use.
 *
 * @author_for_template		peterarsentev
 * @author_tester           k0r0tk0ff
 * @date		11/09/2016
 * @version		4.0
 *
 * Create class Calculate. Add "+","-","*","/","^" operation.
 * Must be adaptive to type int, short, long, float, double.
 * Check second arg for division on zero. If second arg == 0 spawn java.lang.IllegalStateException
 *
 */

public class Calculate{
	//private static final Logger log = getLogger(Calculator.class);

	public static void main(String[] arg) throws Exception {
		/**
		 * Initialization NOT null variables
		 */
		double first = 1.0;
		String entered_operation = "+";
		double second = 1.0;

		//try {
		   if(arg.length > 0) {
				ArgRunner arg_runner = new ArgRunner(arg);
				first = arg_runner.first;
				entered_operation = arg_runner.entered_operation;
				second = arg_runner.second;
			}
           else{
		/**
		 * Interactive entering the arguments
		 */
		    //} catch (ArrayIndexOutOfBoundsException e2) {
			InteractRunner interact_runner = new InteractRunner();
			first = interact_runner.first;
			entered_operation = interact_runner.entered_operation;
			second = interact_runner.second;

		}

		Calculator calculator = new Calculator(first, entered_operation, second);

		/**
		 * Do arithmetic operation,
		 * Code is commented, becouse the Maven do not compile
		 * whith operand Switch-Case

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
		 * Do arithmetic operation, that has been entered whith If-Else construction
		 */
	}
}


