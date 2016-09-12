package ru.lesson.lessons;

import java.util.Scanner;

/*
 * @(#)InteractRunner.java
 *
 * Copyright (c)
 * Free to any use.
 *
 * @author_for_template		peterarsentev
 * @author_tester           k0r0tk0ff
 * @date		11/09/2016
 * @version		2.0
 *
 * Create class InteractRunner. Add the first argument, entered operation, second argument.
 * (User enter arguments and operation interact)
 *
 * Use SOLID princips.
 */


public class InteractRunner {
	/**
	 * Initialization NOT null variables
	 */
	double first = 2.0;
	String entered_operation = "x";
	double second = 3.0;

	public InteractRunner() {

		/**
		 * Determinate of default constructor
		 * Main logic of class
		 */

		Scanner reader = new Scanner(System.in);
		System.out.println ("  This program takes 3 parameters (for CLI and Interact enter): ");
		System.out.println ("  Enter the arguments and operation manually: \n");
		System.out.println ("  Argument 1; Operation (+, -, x, /, ^); Argument 2; \n");

		/**
		 * Scanning from console entered variables
		 */
		try {
			first = Double.parseDouble(reader.next());
			entered_operation = reader.next();
			second = Double.parseDouble(reader.next());
		} catch (NumberFormatException error){
			System.out.println ("\n  Error enter from interact. Again? \n");
		}
		//first = Double.parseDouble(reader.next());
		//entered_operation = reader.next();
		//second = Double.parseDouble(reader.next());
	}

	public void main(String[] arg){
	}
}



