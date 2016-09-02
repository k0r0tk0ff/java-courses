import java.io.*;

/*
 * @(#)Calculate.java
 *
 * Copyright (c)
 * Free to any use.
 *
 * @author		k0r0tk0ff
 * @date		03/09/2016
 * @version		1.0
 *
 * Create class Calculate. Add "+","-","*","/","^" operation.
 * Must be adaptive to type int, short, long, float, double.
 * Check second arg for division on zero. If second arg == 0 spawn java.lang.IllegalStateException
 *
 */


public class Calculator {
	private static final Logger log = getLogger(Calculator.class);

	public double getResult() {
		throw new UnsupportedOperationException();
	}

	public void add(double first, double second) {
		throw new UnsupportedOperationException();
	}

	public void substract(double first, double second) {
		throw new UnsupportedOperationException();
	}

	public void multiple(double first, double second) {
		throw new UnsupportedOperationException();
	}

	public void div(double first, double second) {
		throw new UnsupportedOperationException();
	}

	public void expand(double first, double second) {
		throw new UnsupportedOperationException();
	}

}

	public static void main(String[] args) throws Exception {
		final static String[] OPERATIONS = new String{
			+, -, *, /, ^
		};




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

class InteractRunner{
	public InteractRunner() {
		InputStream inputStream = System.in;
		Reader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

		String arg1 = bufferedReader.readLine();
		String operation = bufferedReader.readLine();
		String arg2 = bufferedReader.readLine();
	}
}