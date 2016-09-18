package ru.lesson.lessons;

/**
 * @(#)Calculate.java
 *
 * Copyright (c)
 * Free to any use.
 *
 * @author    peterarsentev
 * @author    k0r0tk0ff
 * @date		18/09/2016
 * @version		6.2
 *
 * Create class Calculate. Add "+","-","*","/","^" operation.
 * Must be adaptive to type int, short, long, float, double.
 * Check second arg for division on zero. If second arg == 0 spawn java.lang.IllegalStateException
 *
 */

import java.util.Scanner;

public class Calculate{

	/**
	 * Initialization NOT null variables
	 */

	private double first = 1.0;
	private String entered_operation = "+";
	private double second = 1.0;
	private String try_again = "y";
	private String try_again_with_result = "y";
	private double last_result ;
	private int try_again_with_result_exit = 0;
	private String[] arg;
	private int exit_argRunner = 0;

	public Calculate(String[] arg) {

		this.arg = arg;
	}

	/**
	 * Check and Validate input for block "try again ?"
	 * Local vaiable tryagain_exit initializate in method,
	 * not in block of init variable (see above)
	 * @return try_again - user choose "y" or "n"
	 */

	private String tryAgain(){
		int tryagain_exit = 0;

		do {
			System.out.println("\n Try again? (y/n) \n");
			Scanner reader2 = new Scanner(System.in);
			try_again = reader2.next();
			if (try_again.equals("n")) {
				System.exit(0);
			} else if(try_again.equals("y")){
				try_again = "y";
				tryagain_exit = 1;
			}else {
				System.out.println("\n Error enter \n");
			}
		}while (tryagain_exit != 1);
		return try_again;
	}

	/**
	 * Check and Validate input for block "Save the result in argument[1]"
	 * @param result_enter 					- first argument
	 * @return try_again_with_result_return - result.
	 */

	private double try_again_with_result(double result_enter){
		double try_again_with_result_return = 0.0;

		do {
			System.out.println("\n Save the result in argument[1] (y/n) \n");
			Scanner reader3 = new Scanner(System.in);
			try_again_with_result = reader3.next();

			if(try_again_with_result.equals("y")){
				try_again_with_result_return = result_enter;
				try_again_with_result_exit = 1;
			}
			else if(try_again_with_result.equals("n")){
				try_again_with_result_exit = 1;
				try_again_with_result_return = 0.0;
			}
			else {System.out.println("\n Error enter of try_again_with_result !!! \n");}
		}while (try_again_with_result_exit == 0);

		return try_again_with_result_return;
	}

	private void runCalculate(String[] arg) throws Exception{

		exit_argRunner = arg.length;
		while(try_again.equals("y")){

			/**
			 * Check arg from CLI
			 */
			if (exit_argRunner > 0) {
				getArgRunner();
			}

			/**
			 * Work with args from interact mode
			 * block {} if(last_result != 0.0)  --- with save result
			 * block {} else --- without
			 */
			if(last_result != 0.0){
				getInteractRunnerWithResult();
			}
			else {
				getInteractRunner();
			}

			Calculator calculator = new Calculator(first, entered_operation, second);

			/**
			 * Ask user "TRY AGAIN?"
			 */
			try_again = tryAgain();

			/**
			 * Ask user "Save the result in argument[1] ?", and check the input
			 */
			last_result = try_again_with_result(calculator.Result);
		}
	}

	private void getInteractRunner(){
		InteractRunner interact_runner = new InteractRunner();
		interact_runner.runInteractThreeParameter();
		first = interact_runner.first;
		entered_operation = interact_runner.entered_operation;
		second = interact_runner.second;
	}

	private void getInteractRunnerWithResult(){
		InteractRunner interact_runner = new InteractRunner(last_result);
		interact_runner.runInteractTwoParameter();
		first = last_result;
		entered_operation = interact_runner.entered_operation;
		second = interact_runner.second;
	}

	private void getArgRunner(){
		ArgRunner arg_runner = new ArgRunner(arg);
		arg_runner.parseForVariables(arg);
		first = arg_runner.first;
		entered_operation = arg_runner.entered_operation;
		second = arg_runner.second;

		Calculator calculator = new Calculator(first, entered_operation, second);

		/**
		 * For stop infinity run argrunner
		 */
		exit_argRunner = 0;

		try_again = tryAgain();
		last_result = try_again_with_result(calculator.Result);
	}


	public static void main(String[] arg) throws Exception {

	Calculate calculate = new Calculate(arg);
	calculate.runCalculate(arg);
	}
}


