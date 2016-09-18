package ru.lesson.lessons;

import java.util.Scanner;

/**
 * @(#)InteractRunner.java
 *
 * Copyright (c)
 * Free to any use.
 *
 * @author    peterarsentev
 * @author    k0r0tk0ff
 * @date		18/09/2016
 * @version		4.0
 *
 * Create class InteractRunner. Add first argument, entered operation, second argument.
 * If use last result, when add entered operation, second argument.
 * (User enter arguments and operation interact)
 *
 * Use SOLID princips.
 */


class InteractRunner {

	/**
	 * Initialization NOT null variables
	 */

	double first = 2.0;
	String entered_operation = "x";
	double second = 3.0;
	private int success_input = 0;
	private double with_result;

	InteractRunner() {
	}

	/**
	 * Constructor for variant with saved result
	 */

	InteractRunner(double with_result) {
		this.with_result = with_result;
	}

	void runInteractThreeParameter(){
		/**
		 * IF: Parse entered variables, if input is error do it again (success_input = 0)
		 */
		while (success_input == 0){

			/**
		 	* Scanning from console entered variables
		 	*/

			Scanner reader = new Scanner(System.in);

			/**
		 	* Description of programm`s work. Need to understand programm`s work logic
			 * @throw NumberFormatException error ---- if entered values is wrong
		 	*/

			System.out.println("  This program takes 3 parameters (for CLI and Interact enter): ");
			System.out.println("  Enter the arguments and operation: \n");
			System.out.println("  Argument 1; Operation (+, -, x, /, ^); Argument 2; \n");

			try {
				first = Double.parseDouble(reader.next());
				entered_operation = reader.next();
				second = Double.parseDouble(reader.next());
				success_input = 1;
			} catch (NumberFormatException error) {
				System.out.println("\n Error input !!! Try again to input first argument, operation and second argument. \n");
			}
		}
	}

	void runInteractTwoParameter(){
		/**
		 * IF: Parse entered variables, if input is error do it again (success_input = 0)
		 */
		while (success_input == 0){

			/**
			 * Scanning from console entered variables
			 */

			Scanner reader = new Scanner(System.in);

			/**
			 * Description of programm`s work. Need to understand programm`s work logic
			 */

			System.out.println("  This program takes 2 parameters (Interact enter): ");
			System.out.println("  Last result = "+with_result+" is argument 1");
			System.out.println("  Enter the operation and the third argument:");
			System.out.println("  Operation (+, -, x, /, ^); Argument 2; \n");

			try {

				/**
				 * IF: Parse entered variables, if input is error do it again (success_input = 0)
				 */

				entered_operation = reader.next();
				second = Double.parseDouble(reader.next());
				success_input = 1;
			} catch (NumberFormatException error) {
				System.out.println("\n Error input !!! Try again to input operation and second argument. \n");
			}
		}
	}

	void main(){
	}
}



