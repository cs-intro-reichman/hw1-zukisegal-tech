// Computes the future value of a saving investment.
public class FVCalc
 {
 	public static void main(String[] args)
 	{
 		int principal = Integer.parseInt(args[0]);
 		double rate =  Double.parseDouble(args[1]);
 		int years = Integer.parseInt(args[2]);
 		// rate is given as percent (e.g. 10.0 means 10%). use rate/100 in growth formula
 		double futureValue = principal * Math.pow(1 + rate/100.0, years);
 		long rounded = Math.round(futureValue);

 		System.out.println("After " + years + " years, $" + principal + " saved at " + rate + "% will yield $" + rounded);


		// Replace this comment with your code
 	}
}