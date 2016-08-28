import java.util.ArrayList;

public class Calculate {
		public static void main (String[] arg) throws Exception {
			System.out.println("Calculate ...");
			String aaa1 = new String("1");
			String aaa2 = new String("99999999999999999999999999999999999999999999999999999");

			//System.out.println(" The first argument is "+aaa1);
			//System.out.println(" The second argument is "+aaa2);

			//System.out.println(" The first argument: "); 	DeterminantedArg a1 = new DeterminantedArg(aaa1);
			//System.out.println(" The second argument: ");    DeterminantedArg a2 = new DeterminantedArg(aaa2);


			//ArgArray.add(4);
			//ArgArray.add(4);

			//DeterminantedArg(aaa1);
			//DeterminantedArg(aaa2);

			//double sum = ArgArray.get(0) + ArgArray.get(1);
			//System.out.println(" Sum is " + sum);

			Shell a = new Shell();
			a.ArgToShell(aaa1, aaa2);

		}
}

//public class NumberFormatError extends Exception {
//	public String getMessage(){return "Type is illegel...";}
//}

class Shell {
	static String ArgToShell(String[] input) {
		ArrayList ArgArray = new ArrayList(2);

		for(int i=0; i<2; i++) {
		try {
			final short var = Short.parseShort(input[i]);
			System.out.println(" Type of the argument is short");
			ArgArray.add(var);

		} catch (NumberFormatException error1) {
			try {
				final int var = Integer.parseInt(input[i]);
				System.out.println(" Type of the argument is int ");
				ArgArray.add(var);
			} catch (NumberFormatException error2) {
				try {
					final float var = Float.parseFloat(input[i]);
					System.out.println(" Type of the argument is float");
					ArgArray.add(var);
				} catch (NumberFormatException error3) {
					try {
						final double var = Double.parseDouble(input[i]);
						System.out.println(" Type of the argument is double");
						ArgArray.add(var);
					} catch (NumberFormatException error4) {
						try {
							final long var = Long.parseLong(input[i]);
							System.out.println(" Type of the argument is long.");
							ArgArray.add(var);
						} catch (NumberFormatException error5) {
							System.out.println(" Type of the argument is not long.");
						}
					}
				}
			}
		}
		finally { System.out.println("Parse the "+i+" arg is complete");

		}

	}
		double a1 = double(ArgArray.get(0));
		double a2 = double(ArgArray.get(1));

		double sum = a1 + a2; //ArgArray.get(0) + ArgArray.get(1);
		return "The sum is"+sum;
	}

}