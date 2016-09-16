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
		double last_result = 0.0;
		int kastyl = 0;

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

					//Calculator calculator = new Calculator(first, entered_operation, second);
				}

				System.out.println("\n last_result = "+last_result);

				if(last_result != 0.0){
					InteractRunner interact_runner = new InteractRunner("with_last_result");
					first = last_result;
					entered_operation = interact_runner.entered_operation;
					second = interact_runner.second;
				}
				else {
					InteractRunner interact_runner = new InteractRunner();
					first = interact_runner.first;
					entered_operation = interact_runner.entered_operation;
					second = interact_runner.second;
				}

			} catch (ArrayIndexOutOfBoundsException e2){

				/**
				 * Try interact enter, if CLI input is wrong
				 */

				//InteractRunner interact_runner = new InteractRunner();
				System.out.println("\n AI AI AI \n");

				/**
				 * Try to do operation with last result
				 */



				//Calculator calculator = new Calculator(first, entered_operation, second);
			}

			Calculator calculator = new Calculator(first, entered_operation, second);

			/**
		 	* Ask user "TRY AGAIN?"
		 	*/

			System.out.println("\n Try again? (y/n) \n");
			Scanner reader2 = new Scanner(System.in);
			try_again = reader2.next();
			if(try_again.equals("n")){System.exit(0);}

			/**
			 * Ask user "Save the result in argument[1] ?", and check the input
			 */
		    do {
		   	System.out.println("\n Save the result in argument[1] (y/n) \n");
		   	Scanner reader3 = new Scanner(System.in);
           	try_again_with_result = reader3.next();

			if(try_again_with_result.equals("y")){
					System.out.println("\n kastyl = 1 in block try_again_with_result==y \n");
					kastyl = 1;
					last_result = calculator.Result;
				}
				else if(try_again_with_result.equals("n")){
					System.out.println("\n kastyl = 1 in block try_again_with_result==n \n");
					kastyl = 1;
					last_result = 0.0;
				}
				else {System.out.println("\n Error enter of try_again_with_result !!! \n");}
			}while (kastyl == 0);

			//String a = new String("aaa");
			//String b = new String("bbb");
			//work if(a.equals("aaa")){System.out.println("\n aaa  ==  bbb \n");}
			//work if(a.equals("aaa")||b.equals("bbb")){System.out.println("\n aaa  ==  bbb \n");}
			//work if(a.equals(b)){System.out.println("\n a == b \n");} else {System.out.println("\n a ne= b \n");}
			//work if(!a.equals(b)){System.out.println("\n a != b \n");}
			//work if(!a.equals(b)||!a.equals("bbb")){System.out.println("\n a != b \n");}
		}
		//System.out.println("\n Entered value is " + try_again);
	}
}


