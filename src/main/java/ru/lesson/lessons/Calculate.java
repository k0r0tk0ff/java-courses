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

public class Calculate{

	public static void main(String[] arg) throws Exception {
		/**
		 * Initialization NOT null variables
		 */
		double first = 1.0;
		String entered_operation = "+";
		double second = 1.0;

		try {
			if (arg.length > 0) {
				ArgRunner arg_runner = new ArgRunner(arg);
				first = arg_runner.first;
				entered_operation = arg_runner.entered_operation;
				second = arg_runner.second;
			}
		} 	catch (ArrayIndexOutOfBoundsException e2) {
				InteractRunner interact_runner = new InteractRunner();
				first = interact_runner.first;
				entered_operation = interact_runner.entered_operation;
				second = interact_runner.second;
			}

        //else{
		/**
		 * Interactive entering the arguments
		 */
		//    }

		Calculator calculator = new Calculator(first, entered_operation, second);
	}
}


