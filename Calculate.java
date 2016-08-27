public class Calculate {
		public static void main (String[] arg) throws Exception{
			System.out.println("Calculate ...");

			//int first = Integer.valueOf(arg[0]);
			//int second = Integer.valueOf(arg[1]);
			//int sum = first + second;

			//System.out.println("\n First argument  is "+arg[0]);
			//System.out.println("Second argument  is "+arg[1]);

			//System.out.println("\n Sum is "+sum);

			String aaa1 = new String("1");
			String aaa2 = new String("99999999999999999999999999999999999999999999999999999");

			//System.out.println(" The first argument is "+aaa1);
			//System.out.println(" The second argument is "+aaa2);

			System.out.println(" The first argument: "); 	DeterminantedArg a1 = new DeterminantedArg(aaa1);
			System.out.println(" The second argument: ");    DeterminantedArg a2 = new DeterminantedArg(aaa2);

			System.out.println("\n The first argument is "+a1);
			System.out.println(" The second argument is "+a2);

			//try { int AA = Double.parseDouble(arg2); System.out.println(" The second argument is int ");}
			//catch(NumberFormatException error){System.out.println(" The first argument is not int ");}


			// etalon
			//try { int WW = Integer.parseInt(arg1); System.out.println(" The first argument is int ");}
			//catch(Exception e){System.out.println(" The first argument is not int ");}
		}
static class DeterminantedArg{
	public DeterminantedArg(String input) {
		try { final short var = Short.parseShort(input); System.out.println(" Type of the argument is short");}
		catch(NumberFormatException error1){
			try { final int var = Integer.parseInt(input); System.out.println(" Type of the argument is int ");}
			catch(NumberFormatException error2){
				try { final float var = Float.parseFloat(input); System.out.println(" Type of the argument is float");}
				catch(NumberFormatException error3) {
					try { final double var = Double.parseDouble(input); System.out.println(" Type of the argument is double");}
					catch(NumberFormatException error4) {
						try { final long var = Long.parseLong(input); System.out.println(" Type of the argument is long.");}
						catch(NumberFormatException error5) {}
					}
				}
			}
		}
	}
}

}