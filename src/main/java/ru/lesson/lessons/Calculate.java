package ru.lesson.lessons;

/*
 * @(#)Calculate.java
 *
 * Copyright (c)
 * Free to any use.
 *
 * @author_for_template		peterarsentev
 * @author_tester           k0r0tk0ff
 * @date		12/09/2016
 * @version		4.1
 *
 * Create class Calculate. Add "+","-","*","/","^" operation.
 * Must be adaptive to type int, short, long, float, double.
 * Check second arg for division on zero. If second arg == 0 spawn java.lang.IllegalStateException
 *
 */

import java.util.Scanner;

public class Calculate{

	public static void main(String[] arg) throws Exception {
		/**
		 * Initialization NOT null variables
		 */
		double first = 1.0;
		String entered_operation = "+";
		double second = 1.0;
		String try_again = "y";
		String try_again_with_result = "y";

		while(try_again.equals("y")){
			try {

				/**
				 * Check arg from CLI
				 */

				if (arg.length > 0) {
					ArgRunner arg_runner = new ArgRunner(arg);
					first = arg_runner.first;
					entered_operation = arg_runner.entered_operation;
					second = arg_runner.second;
				}
			} catch (ArrayIndexOutOfBoundsException e2) {

				/**
				 * Try interact enter, if CLI input is wrong
				 */

				InteractRunner interact_runner = new InteractRunner();
				first = interact_runner.first;
				entered_operation = interact_runner.entered_operation;
				second = interact_runner.second;
			}

				Calculator calculator = new Calculator(first, entered_operation, second);

			/**
		 	* Ask user "TRY AGAIN?"
		 	*/

			System.out.println("\n Try again? (y/n) \n");
			Scanner reader2 = new Scanner(System.in);
			try_again = reader2.next();

			/**
			 * Ask user "Save the result in argument[1] ?"
			 */

			//System.out.println("\n Save the result in argument[1] (y/n) \n");
			//Scanner reader3 = new Scanner(System.in);
			//try_again_with_result = reader3.next();
		}
		//System.out.println("\n Entered value is " + try_again);
	}
}


