package ru.lesson.lessons;

/*
 * @(#)ArgRunner.java
 *
 * Copyright (c)
 * Free to any use.
 *
 * @author_for_template		peterarsentev
 * @author_tester           k0r0tk0ff
 * @date		11/09/2016
 * @version		2.0
 *
 * Create class ArgRunner. Add the first argument, entered operation, second argument.
 * 
 * Use SOLID princips.
 */

public class ArgRunner {
	double first = 2.0;
	String entered_operation = "x";
	double second = 3.0;

	public ArgRunner(String[] arg) {

		first = Double.parseDouble(arg[0]);
		entered_operation = String.valueOf(arg[1]);
		second = Double.parseDouble(arg[2]);

		/**
		 * Checking the entered arguments
		 * (for tests)
		 *
		 * System.out.println ("\n Argument 1: "+first);
		 * System.out.println ("\n Argument 2: "+second);
		 * System.out.println ("\n Operation: "+entered_operation);
		 */
	}

	public void main(String[] arg) throws Exception {
	}
}

