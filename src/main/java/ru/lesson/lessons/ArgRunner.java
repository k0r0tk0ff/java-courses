package ru.lesson.lessons;

/*
 * @(#)ArgRunner.java
 *
 * Copyright (c)
 * Free to any use.
 *
 * @author_for_template		peterarsentev
 * @author_tester           k0r0tk0ff
 * @date		12/09/2016
 * @version		2.2
 *
 * Create class ArgRunner. Add the first argument, entered operation, second argument.
 * 
 * Use SOLID princips.
 */

public class ArgRunner {
	double first = 1.0;
	String entered_operation = "x";
	double second = 1.0;

	public ArgRunner(String[] arg) throws Exception {

		/**
		 * Scanning entered variables from entered in CLI arguments
		 * (in CLI, with "java calculate arg[0] arg[1] arg[2]")
		 */

        try {
			first = Double.parseDouble(arg[0]);
			entered_operation = String.valueOf(arg[1]);
			second = Double.parseDouble(arg[2]);
		} catch (NumberFormatException error){

		/**
		 *  If entered variables from entered in CLI arguments is wrong,
		 *  go to interact input
		 */

			System.out.println ("\n  Error enter from CLI, try enter interact: \n");
		//	InteractRunner interact_runner = new InteractRunner();
		//	first = interact_runner.first;
		//	entered_operation = interact_runner.entered_operation;
		//	second = interact_runner.second;
			//System.exit(0);
		}
	}

	public void main(String[] arg) throws Exception {
	}
}

