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
	String try_again = "y";

	public InteractRunner() {

		/**
		 * Determinate of default constructor
		 * Main logic of class
		 */

		while (try_again.equals("y")){
			Scanner reader = new Scanner(System.in);
			System.out.println("  This program takes 3 parameters (for CLI and Interact enter): ");
			System.out.println("  Enter the arguments and operation manually: \n");
			System.out.println("  Argument 1; Operation (+, -, x, /, ^); Argument 2; \n");

			/**
		 	* Scanning from console entered variables
		 	*/
			try {
				first = Double.parseDouble(reader.next());
				entered_operation = reader.next();
				second = Double.parseDouble(reader.next());
			} catch (NumberFormatException error) {
				System.out.println("\n Error enter !!! \n");
				//	}

				/**
				 * Ask user "TRY AGAIN?"
				 */
				System.out.println(" Try again? (y/n) \n");
				Scanner reader2 = new Scanner(System.in);
				try_again = reader2.next();

				System.out.println("\n Entered value is " + try_again);

				do {
					System.out.println("\n Please, enter \"y\" or \"n\" \n");
					Scanner reader3 = new Scanner(System.in);
					try_again = reader3.next();
					if(try_again.equals("n")) System.exit(0);
					//System.out.println("in block {}");
				} while (!try_again.equals("y"));

				/**
				 * Exit, if entered "n"
				 */
				//if (try_again.equals("n")) System.exit(0);

			}

		}
		//first = Double.parseDouble(reader.next());
		//entered_operation = reader.next();
		//second = Double.parseDouble(reader.next());
	}

	public void main(String[] arg){
	}
}



