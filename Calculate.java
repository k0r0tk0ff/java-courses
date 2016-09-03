import com.sun.org.apache.regexp.internal.RE;
import com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderFactoryImpl;

import java.io.*;

/*
 * @(#)Calculate.java
 *
 * Copyright (c)
 * Free to any use.
 *
 * @author_for_template		peterarsentev
 * @author_tester      k0r0tk0ff
 * @date		03/09/2016
 * @version		1.0
 *
 * Create class Calculate. Add "+","-","*","/","^" operation.
 * Must be adaptive to type int, short, long, float, double.
 * Check second arg for division on zero. If second arg == 0 spawn java.lang.IllegalStateException
 *
 */


public class Calculate{
	//private static final Logger log = getLogger(Calculator.class);

	public void getResult(double getResult1) {
		System.out.println("\n Result is "+getResult1);
	}

	public static double add(double first, double second) {
		return first + second;
	}

	public static double substract(double first, double second) {
		return first - second;
	}

	public static double multiple(double first, double second) {
		return first * second;
	}

	public static double div(double first, double second) {
		if(second == 0)throw new UnsupportedOperationException(); System.out.println(" div on 0 !!!");
		return first / second;
	}

	public static double expand(double first, double second) {
		double expand_value = 1.0;
		if(second == 0) expand_value = 1.0;
			else if(second == 1) expand_value = first;
				else {
					for (int i = 0; i < second; i++) {
						expand_value = expand_value * first;
						}
				}
		return expand_value;
	}

	public static void main(String[] arg) throws Exception {
		double first = 8.0;
		String entered_operation = "/";
		double second = 0.0;
		Calculate Result = new Calculate();

		/**
		 * Parse the arguments
		 */

		try {
			first = Double.valueOf(arg[0]);
			entered_operation = arg[1];
			second = Double.valueOf(arg[2]);
		} catch (ArrayIndexOutOfBoundsException e) {
			    System.out.println("This program takes 3 parameters: ");
			    System.out.println("  Argument 1; Operation (+, -, *, /, ^); Argument 2; \n");
		}

		System.out.println(" Argument 1 = "+first);
		System.out.println(" Operation  = "+entered_operation);
		System.out.println(" Argument 2 = "+second);

		switch (entered_operation) {
			case "+":
				Result.getResult(Result.add(first, second));
				break;
			case "-":
				Result.getResult(Result.substract(first, second));
				break;
			case "*":
				Result.getResult(Result.multiple(first, second));
				break;
			case "/":
				Result.getResult(Result.div(first, second));
				break;
			case "^":
				Result.getResult(Result.expand(first, second));
				break;
			default: System.out.println("\n Invalid entered operation");
				break;
		}
	}
}



/**
 *
 * Class for work with arguments whose get from cli with run
 *
 */

class ArgRunner{
	public ArgRunner(String arg1, String operation, String arg2) {


	}
}

/**
 *
 * 	Class for work with interactive added arguments after run
 *
 */

/*
*
//class InteractRunner throws Exception{
//		InputStream inputStream = System.in;
//		Reader inputStreamReader = new InputStreamReader(inputStream);
//		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

//		String arg1 = bufferedReader.readLine();
//		String operation = bufferedReader.readLine();
//		String arg2 = bufferedReader.readLine();
//}
*
*/