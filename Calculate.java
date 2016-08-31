import java.util.ArrayList;

public class Calculate {
		public static void main (String[] arg) throws Exception {
			System.out.println("Calculate ...");
			String aaa1 = new String("1");
			String aaa2 = new String("1.9999");

			//String[] StrArray = new String[]{"11", "11.2"};
			// incapsulate to String array our arguments
			String[] StrArray = new String[]{String.valueOf(aaa1), String.valueOf(aaa2)};

			ArgToShell a = new ArgToShell();



			a.ArgToShell(StrArray);

		}
}

//public class NumberFormatError extends Exception {
//	public String getMessage(){return "Type is illegel...";}
//}

class ArgToShell {
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
		finally { System.out.println("Parse the "+(i+1)+" arg is complete");

		}

	}
		System.out.println("\n The first arg is "+ArgArray.get(0));
		System.out.println(" The second arg is "+ArgArray.get(1));

		// Catch many exception, HZ how to do sum without convert to double type
		//double a1 = (double)ArgArray.get(0);
		//double a2 = (double)ArgArray.get(1);
		//double sum = a1 + a2;

		//But i want ===> double sum = ArgArray.get(0) + ArgArray.get(1);
		//System.out.println("\n The sum is"+sum);
		//return String.valueOf(sum);

		return "\n The end";
	}

}

class ArgRunner{
	public ArgRunner(String arg1, String operation, String arg2) {
		//if(operation ){}

	}
}

class InteractRunner{
	public InteractRunner() {
	}
}