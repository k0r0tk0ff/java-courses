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

    private void runParserForInput(String parameter_count){

        /**
         * Scanning from console entered variables and parse to "double" and "String" type
         */
        switch (parameter_count) {
            case "three_parameters":
                Scanner reader = new Scanner(System.in);
                first = Double.parseDouble(reader.next());
                entered_operation = reader.next();
                second = Double.parseDouble(reader.next());
                break;
            case "two_parameters":
                Scanner reader2 = new Scanner(System.in);
                entered_operation = reader2.next();
                second = Double.parseDouble(reader2.next());
                break;
        }
    }

    void runInteractThreeParameter(){
		/**
		 * IF: Parse entered variables, if input is error do it again (success_input = 0)
		 */
		while (success_input == 0){

			/**
		 	* Description of programm`s work. Need to understand programm`s work logic
     		* @throw method runParserForInput() spawn NumberFormatException error if entered values is wrong
		 	*/
			System.out.println("  This program takes 3 parameters (for CLI and Interact enter): ");
			System.out.println("  Enter the arguments and operation: \n");
			System.out.println("  Argument 1; Operation (+, -, x, /, ^); Argument 2; \n");

			try {
                runParserForInput("three_parameters");
                success_input = 1;
            } catch (NumberFormatException error) {
				System.out.println("\n Error input !!! ");
                System.out.println("Try again to input first argument, operation and second argument. \n");
            }
		}
	}

    void runInteractTwoParameter(){
		/**
		 * IF: Parse entered variables, if input is error do it again (success_input = 0)
		 */
		while (success_input == 0){

			/**
			 * Description of programm`s work. Need to understand programm`s work logic
			 */
			System.out.println("  This program takes 2 parameters (Interact enter): ");
			System.out.println("  Last result = "+with_result+" is argument 1");
			System.out.println("  Enter the operation and the third argument:");
			System.out.println("  Operation (+, -, x, /, ^); Argument 2; \n");

            /**
             * IF: Parse entered variables, if input is error do it again
             */
			try {
                runParserForInput("two_parameters");
                success_input = 1;
			} catch (NumberFormatException error) {
				System.out.println("\n Error input !!! Try again to input operation and second argument. \n");
			}
		}
	}

	void main(){
	}
}



