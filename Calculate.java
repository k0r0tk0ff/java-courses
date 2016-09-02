import com.sun.org.apache.regexp.internal.RE;
import com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderFactoryImpl;

import java.io.*;

/*
 * @(#)Calculate.java
 *
 * Copyright (c)
 * Free to any use.
 *
 * @author		peterarsentev
 * @tester      k0r0tk0ff
 * @date		03/09/2016
 * @version		1.0
 *
 * Create class Calculate. Add "+","-","*","/","^" operation.
 * Must be adaptive to type int, short, long, float, double.
 * Check second arg for division on zero. If second arg == 0 spawn java.lang.IllegalStateException
 *
 */


public class Calculate {
	//private static final Logger log = getLogger(Calculator.class);

	public double getResult() {
    return 0.0;
	}

	public static void add(double first, double second) {
		double sum = first + second;
	}

	public static void substract(double first, double second) {
		double substract = first - second;
	}

	public static void multiple(double first, double second) {
		double multiple = first * second;
	}

	public static void div(double first, double second) {
		if(second == 0)throw new UnsupportedOperationException();
		double div = first / second;
	}

	public static void expand(double first, double second) {
		for(int i=0; i<second; i++){
			first = (first * second);
			}
	}

	public static void main(String[] arg) throws Exception {
		double first;
		String entered_operation = new String ("+");
		double second;
		Calculate Result = new Calculate();

		/**
		 * Parse the arguments
		 */

		try {
			first = Double.parseDouble(arg[0]);
			entered_operation = String.valueOf(arg[1]);
			second = Double.valueOf(arg[2]);
			System.out.print(" Argument 1 = "+first);
			System.out.print(" Operation = "+entered_operation);
			System.out.print(" Argument 2 = "+second);
		} catch (ArrayIndexOutOfBoundsException e) {
			    System.out.println("This program takes 3 parameters: ");
		//for test		System.out.println("  Default Operation is +");
			    System.out.println("  Argument 1; Operation (+, -, *, /, ^); Argument 2; \n");
		}

		switch (entered_operation) {
			case "+":
				System.out.println("\n Result is "+Result.getResult(Calculate.add(first, second)));
				break;
			case "-":
				System.out.println("\n Result is "+Result.getResult(Calculate.substract(first, second)));
				break;
			case "*":
				System.out.println("\n Result is "+Result.getResult(Calculate.multiple(first, second)));
				break;
			case "/":
				System.out.println("\n Result is "+Result.getResult(Calculate.div(first, second)));
				break;
			case "^":
				System.out.println("\n Result is "+Result.getResult(Calculate.expand(first, second)));
				break;
			default: System.out.println("\n Invalid entered operation");
				break;
		}


		System.out.println("\n Result is "+Result.getResult());
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